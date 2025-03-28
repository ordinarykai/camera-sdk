package com.netsdk.lib.structure;


import com.netsdk.lib.NetSDKLib;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author ： 260611
 * @description ： 交通路口过车事件 (对应 DH_ALARM_TRAFFIC_FLOW_JUNTION)
 * @since ： Created in 2022/03/10 10:12
 */

public class ALARM_TRAFFIC_FLOW_JUNTION_INFO extends NetSDKLib.SdkStructure {
    /**
     * 事件动作 0:脉冲
     */
    public int              nAction;
    /**
     * 通道号
     */
    public int              nChannel;
    /**
     * 事件名称
     */
    public byte[]           szName = new byte[128];
    /**
     * 事件发生的时间
     */
    public NET_TIME_EX      stuUTC = new NET_TIME_EX();
    /**
     * 事件时间毫秒数
     */
    public int              nUTCMS;
    /**
     * 表示抓拍序号  1表示抓拍正常结束 0表示抓拍异常结束
     */
    public int              nSequence;
    /**
     * 区域路口过车信息
     */
    public TRAFFIC_FLOW_JUNTION_INFO stuFlowJunction = new TRAFFIC_FLOW_JUNTION_INFO();
    /**
     * 保留字节
     */
    public byte[]           szReserverd = new byte[1024];

    @Override
    public String toString() {
        try {
            return "ALARM_TRAFFIC_FLOW_JUNTION_INFO{" +
                    "nAction=" + nAction +
                    ", nChannel=" + nChannel +
                    ", szName UTF-8=" + new String(szName,"UTF-8").trim() +
                    ", szName GBK=" + new String(szName,"GBK").trim() +
                    ", stuUTC=" + stuUTC +
                    ", nUTCMS=" + nUTCMS +
                    ", nSequence=" + nSequence +
                    ", stuFlowJunction=" + stuFlowJunction.toString() +
                    '}';
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}

