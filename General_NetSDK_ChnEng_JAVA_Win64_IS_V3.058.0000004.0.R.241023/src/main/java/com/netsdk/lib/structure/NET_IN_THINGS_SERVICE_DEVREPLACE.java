package com.netsdk.lib.structure;


import com.netsdk.lib.NetSDKLib;

/**
 * @author 260611
 * @description 子设备替换输入参数(对应 EM_THINGS_SERVICE_TYPE_DEVREPLACE)
 * @date 2022/04/20 10:50:23
 */
public class NET_IN_THINGS_SERVICE_DEVREPLACE extends NetSDKLib.SdkStructure {
    /**
     * 结构体大小, 调用者必须初始化该字段
     */
    public int              dwSize;
    /**
     * 产品ID，全网唯一
     */
    public byte[]           szProductID = new byte[64];
    /**
     * 设备ID
     */
    public byte[]           szDeviceID = new byte[64];
    /**
     * 被替换空开ID
     */
    public byte[]           szReplacedDevID = new byte[64];
    /**
     * 新空开ID
     */
    public byte[]           szNewDevID = new byte[64];

    public NET_IN_THINGS_SERVICE_DEVREPLACE() {
        this.dwSize = this.size();
    }
}

