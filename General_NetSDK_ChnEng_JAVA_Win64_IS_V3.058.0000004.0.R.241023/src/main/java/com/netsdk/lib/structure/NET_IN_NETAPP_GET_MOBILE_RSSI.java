package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * EM_RPC_NETAPP_TYPE_GET_MOBILE_RSSI 入参
*/
public class NET_IN_NETAPP_GET_MOBILE_RSSI extends NetSDKLib.SdkStructure
{
    public int              dwSize;
    /**
     * 无线模块名称,参见枚举定义 {@link com.netsdk.lib.enumeration.EM_WIRELESS_MODE}
    */
    public int              emName;

    public NET_IN_NETAPP_GET_MOBILE_RSSI() {
        this.dwSize = this.size();
    }
}

