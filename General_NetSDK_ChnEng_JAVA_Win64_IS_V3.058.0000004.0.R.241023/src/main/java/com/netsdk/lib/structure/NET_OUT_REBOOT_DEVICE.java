package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_RebootDevice 接口输出参数
*/
public class NET_OUT_REBOOT_DEVICE extends NetSDKLib.SdkStructure
{
    /**
     * 结构体大小
    */
    public int              dwSize;

    public NET_OUT_REBOOT_DEVICE() {
        this.dwSize = this.size();
    }
}

