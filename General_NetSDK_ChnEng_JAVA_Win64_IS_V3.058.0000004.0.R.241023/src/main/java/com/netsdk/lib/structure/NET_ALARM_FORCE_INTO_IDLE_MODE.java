package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 强制进入休眠模式通知 (对应 DH_ALARM_FORCE_INTO_IDLE_MODE)
*/
public class NET_ALARM_FORCE_INTO_IDLE_MODE extends NetSDKLib.SdkStructure
{
    /**
     * 通道号
    */
    public int              nChannelID;
    /**
     * 事件动作, 0:Pulse
    */
    public int              nAction;
    /**
     * 事件名称
    */
    public byte[]           szName = new byte[128];
    /**
     * 事件发生的时间,参见结构体定义 {@link com.netsdk.lib.NetSDKLib.NET_TIME_EX}
    */
    public NetSDKLib.NET_TIME_EX stuUTC = new NetSDKLib.NET_TIME_EX();
    /**
     * 保留字节
    */
    public byte[]           szReserved = new byte[1024];

    public NET_ALARM_FORCE_INTO_IDLE_MODE() {
    }
}

