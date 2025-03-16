package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_RemoveApp 接口输入参数
*/
public class NET_IN_REMOVE_APP extends NetSDKLib.SdkStructure
{
    /**
     * 结构体大小
    */
    public int              dwSize;
    /**
     * APP的ID
    */
    public int              nAppID;
    /**
     * APP的名称
    */
    public byte[]           szAppName = new byte[128];

    public NET_IN_REMOVE_APP() {
        this.dwSize = this.size();
    }
}

