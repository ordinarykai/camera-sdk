package com.netsdk.lib.structure;

import com.netsdk.lib.NetSDKLib;
/**
 * @author 251823
 * @version 1.0
 * @description {@link NetSDKLib#CLIENT_SetCameraCfg}的出参
 * @date 2020/11/06
 */
public class NET_OUT_SET_CAMERA_CFG extends NetSDKLib.SdkStructure {
	// 结构体大小
    public int              dwSize;

    public NET_OUT_SET_CAMERA_CFG() {
	   this.dwSize = this.size();
	}
}

