package com.netsdk.lib.structure;

import com.netsdk.lib.NetSDKLib;

import static com.netsdk.lib.constant.SDKStructureFieldLenth.MAX_CHANNEL_ID_LEN;

/**
 * 通道相关信息
 *
 * @author 47040
 * @version 1.0.0
 * @since Created in 2021/3/9 9:16
 */
public class NET_CHANNEL_INFO extends NetSDKLib.SdkStructure {
    /**
     * 通道编号
     */
    public byte[]           szID = new byte[MAX_CHANNEL_ID_LEN];
    /**
     * 报警级别,范围 [1,6]
     */
    public int              nAlarmLevel;
    /**
     * 保留字节
     */
    public byte[]           byReserved = new byte[1024];
}

