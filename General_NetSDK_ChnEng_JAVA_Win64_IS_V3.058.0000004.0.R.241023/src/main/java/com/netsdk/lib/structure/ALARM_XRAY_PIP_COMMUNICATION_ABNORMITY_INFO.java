package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 事件类型DH_ALARM_XRAY_PIP_COMMUNICATION_ABNORMITY (X射线画中画通讯异常事件) 对应的数据块描述信息
*/
public class ALARM_XRAY_PIP_COMMUNICATION_ABNORMITY_INFO extends NetSDKLib.SdkStructure
{
    /**
     * 通道号
    */
    public int              nChannelID;
    /**
     * 事件动作,0表示脉冲事件,1表示事件开始,2表示事件结束;
    */
    public int              nAction;
    /**
     * 事件发生的时间,参见结构体定义 {@link com.netsdk.lib.NetSDKLib.NET_TIME_EX}
    */
    public NetSDKLib.NET_TIME_EX stuTime = new NetSDKLib.NET_TIME_EX();
    /**
     * 事件ID
    */
    public int              nEventID;
    /**
     * 时间戳(单位是毫秒)
    */
    public double           dbPTS;
    /**
     * 事件名称
    */
    public byte[]           szName = new byte[128];
    /**
     * 事件公共扩展字段结构体,参见结构体定义 {@link com.netsdk.lib.structure.NET_EVENT_INFO_EXTEND}
    */
    public NET_EVENT_INFO_EXTEND stuEventInfoEx = new NET_EVENT_INFO_EXTEND();
    /**
     * 预留字段
    */
    public byte[]           szReserved = new byte[1024];

    public ALARM_XRAY_PIP_COMMUNICATION_ABNORMITY_INFO() {
    }
}

