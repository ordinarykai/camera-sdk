package com.netsdk.lib.structure;

import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.structure.TRAFFIC_EVENT;
import com.netsdk.lib.structure.TRAFFIC_INFO;
import com.netsdk.lib.structure.TRAFFIC_STATE;

/**
 * @author 251823
 * @description 信号机交通信息事件, 对应事件类型NET_ALARM_RTSC_TRAFFIC
 * @date 2021/09/01
 */
public class ALARM_RTSC_TRAFFIC_INFO extends NetSDKLib.SdkStructure {
	  /**
     *  通道号,从0开始
     */
    public int              nChannelID;
    /**
     *  事件动作, 1表示开始, 2表示结束, -1表示未知
     */
    public int              nEventAction;
    /**
     *  bit0:运行状态
        bit1:控制方式
		bit2:灯色状态信息
		bit3:车道功能状态
		bit4:车道/匝道控制状态信息
		bit5:当前信号方案色步信息
     */
    public int              dwReportState;
    /**
     *  经度个数
     */
    public int              nLongitudeNum;
    /**
     *  经度,格式：度，分，秒(秒为浮点数)
     */
    public double[]         dbLongitude = new double[3];
    /**
     *  纬度个数
     */
    public int              nLatitudeNum;
    /**
     *  纬度,格式：度，分，秒(秒为浮点数)
     */
    public double[]         dbLatitude = new double[3];
    /**
     *  高度，单位为米 
     */
    public double           dbAltitude;
    /**
     *  事件发生时间，带时区偏差的UTC时间，单位秒
     */
    public NET_TIME_EX      UTC;
    /**
     *  交通流信息
     */
    public TRAFFIC_INFO     stuTrafficInfo;
    /**
     *  交通运行状态信息
     */
    public TRAFFIC_STATE    stuTrafficState;
    /**
     *  车辆运行状态信息
     */
    public CAR_INFO         stuCarInfo;
    /**
     *  交通事件信息
     */
    public TRAFFIC_EVENT    stuTrafficEvent;
    /**
     *  预留字节
     */
    public byte[]           byReserved = new byte[256];
}

