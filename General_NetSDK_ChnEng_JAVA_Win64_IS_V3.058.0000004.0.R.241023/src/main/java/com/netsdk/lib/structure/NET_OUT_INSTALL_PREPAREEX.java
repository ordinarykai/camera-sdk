package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_UpgraderInstall接口的 EM_UPGRADE_INSTALL_PREPAREEX命令出参
*/
public class NET_OUT_INSTALL_PREPAREEX extends NetSDKLib.SdkStructure
{
    /**
     * 结构体大小
    */
    public int              dwSize;

    public NET_OUT_INSTALL_PREPAREEX() {
        this.dwSize = this.size();
    }
}

