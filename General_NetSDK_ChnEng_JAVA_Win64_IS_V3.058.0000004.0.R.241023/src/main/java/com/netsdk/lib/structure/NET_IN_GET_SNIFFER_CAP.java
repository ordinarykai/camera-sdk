package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_GetSnifferCaps 接口入参
*/
public class NET_IN_GET_SNIFFER_CAP extends NetSDKLib.SdkStructure
{
    public int              dwSize;

    public NET_IN_GET_SNIFFER_CAP() {
        this.dwSize = this.size();
    }
}

