package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_UnmarkPicMapChannel 接口输出参数
*/
public class NET_OUT_UNMARK_PIC_MAP_CHANNEL extends NetSDKLib.SdkStructure
{
    /**
     * 此结构体大小,必须赋值
    */
    public int              dwSize;
    /**
     * 错误码, -1:未知，0: 操作成功, 1: 部分操作成功, 2: 操作失败
    */
    public int              nErrorCode;
    /**
     * 错误描述
    */
    public byte[]           szErrorInfo = new byte[256];

    public NET_OUT_UNMARK_PIC_MAP_CHANNEL() {
        this.dwSize = this.size();
    }
}

