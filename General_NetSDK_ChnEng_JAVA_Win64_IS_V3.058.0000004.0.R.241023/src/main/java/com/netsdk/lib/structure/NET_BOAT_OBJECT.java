package com.netsdk.lib.structure;

import com.netsdk.lib.NetSDKLib;

/**
 * @author 251823
 * @description 船只物体信息
 * @date 2022/06/16 11:14:19
 */
public class NET_BOAT_OBJECT extends NetSDKLib.SdkStructure {
	/**
	 * 物体ID，每个ID表示一个唯一的物体，不同的物体不能共用一个ID，已经使用过的ID也不能再次使用。
	 */
    public int              nObjectID;
	/**
	 * 船身体到相机的距离，单位米 取值范围0-65535
	 */
    public int              nDistance;
	/**
	 * 船的高度，单位米 取值范围0-255
	 */
    public int              nHeight;
	/**
	 * 船的长度，单位米 取值范围0-2000
	 */
    public int              nWidth;
	/**
	 * 船的速度，单位米/秒 取值范围0-255
	 */
    public int              nSpeed;
	/**
	 * 物体动作支持类型 {@link com.netsdk.lib.enumeration.EM_ACTION}
	 */
    public int              emActionType;
	/**
	 * 矩形范围,点的坐标归一化到[0,8191]区间
	 */
    public NetSDKLib.NET_RECT stuBoundingBox = new NetSDKLib.NET_RECT();
	/**
	 * 包围盒(绝对坐标)
	 */
    public NetSDKLib.NET_RECT stuOriginalBoundingBox = new NetSDKLib.NET_RECT();
	/**
	 * 行驶方向 {@link com.netsdk.lib.enumeration.EM_BOAT_DIRECTION}
	 */
    public int              emDirection;
	/**
	 * 船名或船舷号
	 */
    public byte[]           szBoatCode = new byte[64];
    /**
     * 船只类型 0：未知 1：渔船类 2：挖泥船类 3：军舰类 4：帆船 5：高速船只类 6：客船类 7：货船类 8：其他类
    */
    public int              nBoatType;
	/**
	 * 预留字节
	 */
    public byte[]           byReserved = new byte[56];

	public NET_BOAT_OBJECT() {
	}
}

