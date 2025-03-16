package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 蜂窝网络邻区信息
*/
public class NET_NeighbourCellInfo extends NetSDKLib.SdkStructure
{
    /**
     * 邻小区频点号
    */
    public int              nARFCN;
    /**
     * 邻小区接收功率
    */
    public int              nRSRP;
    /**
     * 邻小区plmn信息
    */
    public int              nPLMN;
    /**
     * 邻小区频段信息
    */
    public byte[]           szBAND = new byte[8];
    /**
     * 邻小区跟踪区域编码
    */
    public byte[]           szTAC = new byte[8];
    /**
     * 邻小区物理小区编号
    */
    public int              nPCI;
    /**
     * 邻小区标识
    */
    public byte[]           szCELLID = new byte[10];
    /**
     * 保留字节
    */
    public byte[]           szReserved = new byte[1022];

    public NET_NeighbourCellInfo() {
    }
}

