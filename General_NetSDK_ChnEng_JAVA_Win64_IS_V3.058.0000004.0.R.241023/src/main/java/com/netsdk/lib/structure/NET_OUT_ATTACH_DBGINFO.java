package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 订阅日志回调出参
*/
public class NET_OUT_ATTACH_DBGINFO extends NetSDKLib.SdkStructure
{
    public int              dwSize;

    public NET_OUT_ATTACH_DBGINFO() {
        this.dwSize = this.size();
    }
}

