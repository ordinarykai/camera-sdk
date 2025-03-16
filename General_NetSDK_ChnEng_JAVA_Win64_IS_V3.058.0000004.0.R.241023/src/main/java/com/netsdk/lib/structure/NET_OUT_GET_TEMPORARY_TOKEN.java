package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_GetTemporaryToken 接口出参
*/
public class NET_OUT_GET_TEMPORARY_TOKEN extends NetSDKLib.SdkStructure
{
    /**
     * 结构体大小
    */
    public int              dwSize;
    /**
     * 临时用户账号信息,参见结构体定义 {@link com.netsdk.lib.structure.NET_TEMP_USER_INFO}
    */
    public NET_TEMP_USER_INFO stuTempUserInfo = new NET_TEMP_USER_INFO();

    public NET_OUT_GET_TEMPORARY_TOKEN() {
        this.dwSize = this.size();
    }
}

