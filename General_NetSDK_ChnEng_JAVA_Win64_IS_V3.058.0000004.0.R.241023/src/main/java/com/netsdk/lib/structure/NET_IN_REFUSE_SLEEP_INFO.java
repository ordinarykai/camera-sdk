package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_RefuseLowPowerDevSleep 接口输入参数
*/
public class NET_IN_REFUSE_SLEEP_INFO extends NetSDKLib.SdkStructure
{
    /**
     * 结构体大小
    */
    public int              dwSize;

    public NET_IN_REFUSE_SLEEP_INFO() {
        this.dwSize = this.size();
    }
}

