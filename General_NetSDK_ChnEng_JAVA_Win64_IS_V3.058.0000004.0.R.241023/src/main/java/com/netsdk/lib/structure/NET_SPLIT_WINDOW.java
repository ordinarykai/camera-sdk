package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 分割窗口信息
*/
public class NET_SPLIT_WINDOW extends NetSDKLib.SdkStructure
{
    public int              dwSize;
    /**
     * 窗口是否有视频源
    */
    public int              bEnable;
    /**
     * 窗口ID
    */
    public int              nWindowID;
    /**
     * 控制ID
    */
    public byte[]           szControlID = new byte[128];
    /**
     * 窗口区域, 自由分割模式下有效,参见结构体定义 {@link com.netsdk.lib.NetSDKLib.NET_RECT}
    */
    public NetSDKLib.NET_RECT stuRect = new NetSDKLib.NET_RECT();
    /**
     * 坐标是否满足直通条件
    */
    public int              bDirectable;
    /**
     * 窗口Z次序
    */
    public int              nZOrder;
    /**
     * 显示信息,参见结构体定义 {@link com.netsdk.lib.structure.NET_SPLIT_WND_SOURCE}
    */
    public NET_SPLIT_WND_SOURCE stuSource = new NET_SPLIT_WND_SOURCE();
    /**
     * OSD个数
    */
    public int              nOSDNum;
    /**
     * OSD信息,参见结构体定义 {@link com.netsdk.lib.NetSDKLib.NET_SPLIT_OSD}
    */
    public NetSDKLib.NET_SPLIT_OSD[] stuOSD = new NetSDKLib.NET_SPLIT_OSD[256];
    /**
     * 窗口是否被锁定位置
    */
    public int              bLock;
    /**
     * 窗口是否具有粘附效果
    */
    public int              bDock;
    /**
     * 窗口是否为会议模式状态
    */
    public int              bMeetingMode;
    /**
     * 窗口是否开启音频使能
    */
    public int              bAudioEnable;
    /**
     * 窗口是否开启轮询
    */
    public int              bTourEnable;

    public NET_SPLIT_WINDOW() {
        this.dwSize = this.size();
        for(int i = 0; i < stuOSD.length; i++){
            stuOSD[i] = new NetSDKLib.NET_SPLIT_OSD();
        }
    }
}

