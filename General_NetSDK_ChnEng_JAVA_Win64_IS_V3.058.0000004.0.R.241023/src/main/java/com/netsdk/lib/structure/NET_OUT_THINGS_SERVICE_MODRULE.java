package com.netsdk.lib.structure;


import com.netsdk.lib.NetSDKLib;

/**
 * @author 260611
 * @description 修改联动规则输出参数(对应 EM_THINGS_SERVICE_TYPE_MODRULE)
 * @date 2022/04/20 10:50:21
 */
public class NET_OUT_THINGS_SERVICE_MODRULE extends NetSDKLib.SdkStructure {
    /**
     * 结构体大小, 调用者必须初始化该字段
     */
    public int              dwSize;
    /**
     * 物模型协议错误码定义
     */
    public int              nErrcode;
    /**
     * 产品ID
     */
    public byte[]           szProductID = new byte[64];
    /**
     * 设备ID
     */
    public byte[]           szDeviceID = new byte[64];

    public NET_OUT_THINGS_SERVICE_MODRULE() {
        this.dwSize = this.size();
    }
}

