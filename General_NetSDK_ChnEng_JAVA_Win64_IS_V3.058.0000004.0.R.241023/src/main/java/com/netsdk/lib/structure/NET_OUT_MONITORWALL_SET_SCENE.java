package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_MonitorWallSetScene接口输出参数(设置电视墙场景)
*/
public class NET_OUT_MONITORWALL_SET_SCENE extends NetSDKLib.SdkStructure
{
    public int              dwSize;

    public NET_OUT_MONITORWALL_SET_SCENE() {
        this.dwSize = this.size();
    }
}

