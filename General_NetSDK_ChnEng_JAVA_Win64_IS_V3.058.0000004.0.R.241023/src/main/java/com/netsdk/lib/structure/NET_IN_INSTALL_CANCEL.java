package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_UpgraderInstall接口的 EM_UPGRADE_INSTALL_CANCEL命令入参
*/
public class NET_IN_INSTALL_CANCEL extends NetSDKLib.SdkStructure
{
    /**
     * 结构体大小
    */
    public int              dwSize;

    public NET_IN_INSTALL_CANCEL() {
        this.dwSize = this.size();
    }
}

