package com.netsdk.lib.structure;


import com.netsdk.lib.NetSDKLib;

/**
 * @author 260611
 * @description 事件类型 EVENT_IVS_TRAFFIC_SPECIAL_VEHICLE_DETECT (特殊车辆检测)对应的数据块描述信息
 * @date 2022/11/29 14:55:30
 */
public class DEV_EVENT_TRAFFIC_SPECIAL_VEHICLE_INFO extends NetSDKLib.SdkStructure {
    /**
     * 通道号
     */
    public int              nChannelID;
    /**
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     */
    public int              nAction;
    /**
     * 事件名称
     */
    public byte[]           szName = new byte[128];
    /**
     * 时间戳(单位:毫秒)
     */
    public double           PTS;
    /**
     * 事件发生的时间
     */
    public NET_TIME_EX      UTC = new NET_TIME_EX();
    /**
     * 事件ID
     */
    public int              nEventID;
    /**
     * 智能事件规则编号
     */
    public int              nRuleId;
    /**
     * 事件对应文件信息
     */
    public NetSDKLib.NET_EVENT_FILE_INFO stuFileInfo = new NetSDKLib.NET_EVENT_FILE_INFO();
    /**
     * 检测到的车牌信息
     */
    public NetSDKLib.DH_MSG_OBJECT stuObject = new NetSDKLib.DH_MSG_OBJECT();
    /**
     * 检测到的车辆信息
     */
    public NetSDKLib.DH_MSG_OBJECT stuVehicle = new NetSDKLib.DH_MSG_OBJECT();
    /**
     * 触发类型 {@link com.netsdk.lib.enumeration.EM_TRIGGER_TYPE}
     */
    public int              emTriggerType;
    /**
     * 公共信息
     */
    public NetSDKLib.EVENT_COMM_INFO stuCommInfo = new NetSDKLib.EVENT_COMM_INFO();
    /**
     * 保留字节
     */
    public byte[]           bReserved = new byte[1020];

    public DEV_EVENT_TRAFFIC_SPECIAL_VEHICLE_INFO() {
    }
}

