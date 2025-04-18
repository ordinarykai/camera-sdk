package com.netsdk.lib.structure;


import com.netsdk.lib.NetSDKLib;

/**
 * @author 251823
 * @version 1.0
 * @description {@link NetSDKLib#CLIENT_SetCameraCfg}的入参
 * @date 2020/11/06
 */
public class NET_IN_SET_CAMERA_CFG extends NetSDKLib.SdkStructure {
	// 结构体大小
    public int              dwSize;
	// 相机编号
    public int              nCameraNo;
	// 相机的信息
    public NET_CAMERA_CFG_INFO stuCameraInfo;

    public NET_IN_SET_CAMERA_CFG() {
        this.dwSize = this.size();
    }
}

