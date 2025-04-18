package com.netsdk.lib.structure;

import com.netsdk.lib.NetSDKLib.DH_POINT;
import com.netsdk.lib.NetSDKLib.SdkStructure;
import com.netsdk.lib.enumeration.NET_EM_STAFF_TYPE;
/**
 * @description  标尺信息
 * @author 119178
 * @date 2021/3/16
 */
public class NET_STAFF_INFO extends SdkStructure {
	/**
	 * 起始坐标点
	 */
    public DH_POINT         stuStartLocation = new DH_POINT();
	/**
	 * 终止坐标点
	 */
    public DH_POINT         stuEndLocation = new DH_POINT();
	/**
	 * 实际长度,单位米
	 */
    public float            nLenth;
	/**
	 * 标尺类型
	 * {@link NET_EM_STAFF_TYPE}
	 */
    public int              emType;
}

