package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 船只物体信息扩展
*/
public class NET_BOAT_OBJECT_EXTERN extends NetSDKLib.SdkStructure
{
    /**
     * AIS融合目标信息,参见结构体定义 {@link com.netsdk.lib.structure.NET_AIS_FUSE_OBJECT}
    */
    public NET_AIS_FUSE_OBJECT stuAISFuseObject = new NET_AIS_FUSE_OBJECT();
    /**
     * 预留字节
    */
    public byte[]           szReserved = new byte[512];

    public NET_BOAT_OBJECT_EXTERN() {
    }
}

