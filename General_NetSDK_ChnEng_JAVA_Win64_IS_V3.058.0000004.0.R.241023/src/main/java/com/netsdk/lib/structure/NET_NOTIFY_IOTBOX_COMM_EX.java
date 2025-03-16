package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
import com.sun.jna.Pointer;
/**
 * 回调的实时数据
*/
public class NET_NOTIFY_IOTBOX_COMM_EX extends NetSDKLib.SdkStructure
{
    /**
     * 回调的数据json内容
    */
    public Pointer          pszOutBuf;
    /**
     * pszOutBuf返回内容大小
    */
    public int              nOutBufLen;
    /**
     * 保留字段
    */
    public byte[]           szResvered = new byte[252];

    public NET_NOTIFY_IOTBOX_COMM_EX() {
    }
}

