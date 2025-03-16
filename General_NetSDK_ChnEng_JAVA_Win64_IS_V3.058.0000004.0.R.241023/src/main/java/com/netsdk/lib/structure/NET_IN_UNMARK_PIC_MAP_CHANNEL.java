package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_UnmarkPicMapChannel 接口输入参数
*/
public class NET_IN_UNMARK_PIC_MAP_CHANNEL extends NetSDKLib.SdkStructure
{
    /**
     * 此结构体大小,必须赋值
    */
    public int              dwSize;
    /**
     * 通道号列表个数
    */
    public int              nChannelCount;
    /**
     * 通道号列表
    */
    public int[]            nChannels = new int[1024];

    public NET_IN_UNMARK_PIC_MAP_CHANNEL() {
        this.dwSize = this.size();
    }
}

