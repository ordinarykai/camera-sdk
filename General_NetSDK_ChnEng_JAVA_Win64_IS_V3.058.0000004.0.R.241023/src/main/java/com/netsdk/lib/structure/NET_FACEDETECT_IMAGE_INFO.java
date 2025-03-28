package com.netsdk.lib.structure;

import com.netsdk.lib.NetSDKLib;

/**
 * @author 47081
 * @version 1.0
 * @description 目标检测记录大图信息
 * @date 2021/2/22
 */
public class NET_FACEDETECT_IMAGE_INFO extends NetSDKLib.SdkStructure {
  /** 文件大小 */
    public int              nLength;
  /** 文件路径 */
    public byte[]           szFilePath = new byte[260];
  /** 保留字段 */
    public byte[]           byReserved = new byte[128];
}

