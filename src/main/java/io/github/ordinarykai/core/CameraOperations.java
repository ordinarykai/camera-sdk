package io.github.ordinarykai.core;

import io.github.ordinarykai.dto.request.PlaybackRequest;
import io.github.ordinarykai.dto.request.StartPreviewRequest;
import io.github.ordinarykai.dto.request.StopPreviewRequest;
import io.github.ordinarykai.dto.response.StreamResponse;

/**
 * 设备操作接口
 *
 * @author ordinarykai
 */
public interface CameraOperations {

    /**
     * 实时视频预览
     */
    StreamResponse startPreview(StartPreviewRequest request);

    /**
     * 停止视频流
     */
    void stopPreview(StopPreviewRequest request);

    /**
     * 录像回放
     */
    StreamResponse playback(PlaybackRequest request);

//    /**
//     * 云台控制
//     */
//    BaseResponse ptzControl(PtzControlRequest request);
//
//    /**
//     * 获取设备信息
//     */
//    DeviceBaseResponse getDeviceInfo(DeviceInfoRequest request);
//
//    /**
//     * 设备状态检测
//     */
//    DeviceStatus checkStatus(DeviceBaseRequest request);

}
