package io.github.ordinarykai.adapter.dahua;

import cn.hutool.core.lang.UUID;
import com.netsdk.demo.frame.RealplayEx;
import com.netsdk.lib.NetSDKLib;
import com.sun.jna.Pointer;
import io.github.ordinarykai.core.CameraOperations;
import io.github.ordinarykai.dto.request.PlaybackRequest;
import io.github.ordinarykai.dto.request.StartPreviewRequest;
import io.github.ordinarykai.dto.request.StopPreviewRequest;
import io.github.ordinarykai.dto.response.StreamResponse;
import io.github.ordinarykai.exception.CameraException;
import jakarta.annotation.Resource;
import jakarta.websocket.Session;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.websocket.WsSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import static com.netsdk.demo.frame.RealplayEx.netSdk;
import static com.netsdk.lib.NetSDKLib.EM_REAL_DATA_TYPE.EM_REAL_DATA_TYPE_FLV_STREAM;
import static com.netsdk.lib.NetSDKLib.NET_RealPlayType.NET_RType_Realplay;
import static io.github.ordinarykai.core.CameraContainer.*;
import static io.github.ordinarykai.exception.ErrorCode.*;

/**
 * 大华摄像头适配器实现
 *
 * @author ordinarykai
 */
@Slf4j
@Component
public class DahuaAdapter implements CameraOperations {

    /**
     * ws 会话存储
     */
    private final ConcurrentHashMap<String, Session> SESSION_MAP = new ConcurrentHashMap<>();

    @Override
    public StreamResponse startPreview(StartPreviewRequest request) {
        // 验证登录句柄
        NetSDKLib.LLong loginHandle = LOGIN_HANDLE_MAP.get(request.getSessionUuid());
        if (loginHandle == null) {
            log.error("Login handle not found for session: {}", request.getSessionUuid());
            throw new CameraException(LOGIN_HANDLE_NOT_FOUND);
        }

        // 启动实时预览，并指定预览回调数据类型为FLV
        String streamId = generateStreamId(request.getSessionUuid(), request.getChannelNo());
        NetSDKLib.NET_IN_REALPLAY_BY_DATA_TYPE inParam = new NetSDKLib.NET_IN_REALPLAY_BY_DATA_TYPE();
        NetSDKLib.NET_OUT_REALPLAY_BY_DATA_TYPE outParam = new NetSDKLib.NET_OUT_REALPLAY_BY_DATA_TYPE();
        inParam.nChannelID = request.getChannelNo();
        inParam.rType = NET_RType_Realplay;
        inParam.emDataType = EM_REAL_DATA_TYPE_FLV_STREAM;
        NetSDKLib.LLong playHandle = netSdk.CLIENT_RealPlayByDataType(loginHandle,
                inParam, outParam, 3000);
        if (playHandle.longValue() == 0) {
            log.error("Start preview failed for streamId {}", streamId);
            throw new CameraException(START_PREVIEW_FAIL);
        }
        log.debug("Preview started successfully. StreamId: {}", streamId);

        // 设置实时数据回调
        setRealDataCallback(playHandle, streamId);
        // 保存预览句柄
        PLAY_HANDLE_MAP.put(streamId, playHandle);
        return new StreamResponse().setStreamId(streamId);
    }

    @Override
    public void stopPreview(StopPreviewRequest request) {
        // 停止预览
        NetSDKLib.LLong playHandle = PLAY_HANDLE_MAP.get(request.getStreamId());
        if (playHandle != null) {
            netSdk.CLIENT_StopRealPlayEx(playHandle);
            PLAY_HANDLE_MAP.remove(request.getStreamId());
        }
    }

    /**
     * 设置实时数据回调（核心推流逻辑）
     */
    private void setRealDataCallback(NetSDKLib.LLong playHandle, String streamId) {
        netSdk.CLIENT_SetRealDataCallBackEx(playHandle, new NetSDKLib.fRealDataCallBackEx() {
            @Override
            public void invoke(NetSDKLib.LLong lRealHandle, int dwDataType, Pointer pBuffer,
                               int dwBufSize, int param, Pointer dwUser) {
                // 将内容转换为字节数组
                byte[] bytes = pBuffer.getByteArray(0, dwBufSize);
                // 回调格式为flv的流
                if ((dwDataType - 1000) == EM_REAL_DATA_TYPE_FLV_STREAM) {
                    // ws发送流数据
                    // 使用pBuffer.getByteBuffer(0,dwBufSize)得到的是一个指向native pointer的ByteBuffer对象,其数据存储在native,
                    // 而webSocket发送的数据需要存储在ByteBuffer的成员变量hb，使用pBuffer的getByteBuffer得到的ByteBuffer其hb为null
                    // 所以，需要先得到pBuffer的字节数组,手动创建一个ByteBuffer
                    ByteBuffer buffer = ByteBuffer.wrap(bytes);
                    Session session = SESSION_MAP.get(streamId);
                    if (session != null && session.isOpen()) {
                        try {
                            session.getBasicRemote().sendBinary(buffer);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }, null, 31); // 31表示订阅所有数据类型
    }

    /**
     * 生成唯一流ID（sessionUuid + channelNo）
     */
    private String generateStreamId(String sessionUuid, int channelNo) {
        return sessionUuid + "_ch" + channelNo;
    }

    @Override
    public StreamResponse playback(PlaybackRequest request) {
        // 验证登录句柄
        NetSDKLib.LLong loginHandle = LOGIN_HANDLE_MAP.get(request.getSessionUuid());
        if (loginHandle == null) {
            log.error("Login handle not found for session: {}", request.getSessionUuid());
            throw new CameraException(LOGIN_HANDLE_NOT_FOUND);
        }

        // 启动录像回放，并指定预览回调数据类型为FLV
        String streamId = generateStreamId(request.getSessionUuid(), request.getChannelNo());
        NetSDKLib.NET_IN_PLAYBACK_BY_DATA_TYPE inParam = new NetSDKLib.NET_IN_PLAYBACK_BY_DATA_TYPE();
        NetSDKLib.NET_OUT_PLAYBACK_BY_DATA_TYPE outParam = new NetSDKLib.NET_OUT_PLAYBACK_BY_DATA_TYPE();
        inParam.nChannelID = request.getChannelNo();
        inParam.emDataType = EM_REAL_DATA_TYPE_FLV_STREAM;
        inParam.stStartTime = convertTime(request.getStartTime());
        inParam.stStopTime =  convertTime(request.getEndTime());
        inParam.fDownLoadDataCallBackEx = new NetSDKLib.fDataCallBackEx() {
            @Override
            public int invoke(NetSDKLib.LLong lRealHandle, NetSDKLib.NET_DATA_CALL_BACK_INFO pDataCallBack, Pointer dwUser) {

                return 0;
            }
        };
        NetSDKLib.LLong playHandle = netSdk.CLIENT_PlayBackByDataType(loginHandle,
                inParam, outParam, 3000);
        if (playHandle.longValue() == 0) {
            log.error("Start playback failed for streamId {}", streamId);
            throw new CameraException(START_PREVIEW_FAIL);
        }
        log.debug("Playback started successfully. StreamId: {}", streamId);
        // 保存预览句柄
        PLAY_HANDLE_MAP.put(streamId, playHandle);
        return new StreamResponse().setStreamId(streamId);
    }

    private static NetSDKLib.NET_TIME convertTime(LocalDateTime time) {
        NetSDKLib.NET_TIME netTime = new NetSDKLib.NET_TIME();
        netTime.dwYear = time.getYear();
        netTime.dwMonth = time.getMonthValue();
        netTime.dwDay = time.getDayOfMonth();
        netTime.dwHour = time.getHour();
        netTime.dwMinute = time.getMinute();
        netTime.dwSecond = time.getSecond();
        return netTime;
    }

}
