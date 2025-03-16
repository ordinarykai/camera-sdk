package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 测温点报警设置Ex
*/
public class CFG_RADIOMETRY_ALARMSETTING_EX extends NetSDKLib.SdkStructure
{
    /**
     * 预报警阈值
    */
    public float            fPreThreshold;
    /**
     * 预报警温度持续时间；单位：秒
    */
    public int              nPreDuration;
    /**
     * 保留字节
    */
    public byte[]           byReserved = new byte[256];

    public CFG_RADIOMETRY_ALARMSETTING_EX() {
    }
}

