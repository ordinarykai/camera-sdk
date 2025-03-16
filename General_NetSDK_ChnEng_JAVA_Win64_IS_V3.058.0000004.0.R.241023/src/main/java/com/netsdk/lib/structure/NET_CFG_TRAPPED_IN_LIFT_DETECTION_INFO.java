package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * EVENT_IVS_TRAPPED_IN_LIFT_DETECTION(电梯困人检测事件)对应的规则配置
*/
public class NET_CFG_TRAPPED_IN_LIFT_DETECTION_INFO extends NetSDKLib.SdkStructure
{
    /**
     * 此结构体大小
    */
    public int              dwSize;
    /**
     * 规则名称,不同规则不能重名
    */
    public byte[]           szName = new byte[128];
    /**
     * 规则使能
    */
    public int              bEnable;
    /**
     * 相应物体类型个数
    */
    public int              nObjectTypeNum;
    /**
     * 相应物体类型列表
    */
    public BYTE_ARRAY_128[] szObjectTypes = new BYTE_ARRAY_128[16];
    /**
     * 报警联动,参见结构体定义 {@link com.netsdk.lib.NetSDKLib.NET_ALARM_MSG_HANDLE}
    */
    public NetSDKLib.NET_ALARM_MSG_HANDLE stuEventHandler = new NetSDKLib.NET_ALARM_MSG_HANDLE();
    /**
     * 云台预置点编号  0~65535
    */
    public int              nPtzPresetId;
    /**
     * 联动业务个数
    */
    public int              nLink;
    /**
     * 联动业务大类选项,参见结构体定义 {@link com.netsdk.lib.structure.NET_LINK_CLASS_TYPE}
    */
    public NET_LINK_CLASS_TYPE[] stuLinkClassType = new NET_LINK_CLASS_TYPE[16];
    /**
     * 跟踪条件规则使能
    */
    public int              bTrackEnable;
    /**
     * 检测区顶点数
    */
    public int              nDetectRegionNum;
    /**
     * 检测区,参见结构体定义 {@link com.netsdk.lib.structure.NET_POINT_EX}
    */
    public NET_POINT_EX[]   stuDetectRegion = new NET_POINT_EX[20];
    /**
     * 辅助线（两点),参见结构体定义 {@link com.netsdk.lib.structure.NET_POINT_EX}
    */
    public NET_POINT_EX[]   stuDetectLine = new NET_POINT_EX[2];
    /**
     * 是否开启辅助线。对应DetectLine。
    */
    public int              bDetectLineEnable;
    /**
     * 最短持续时间, 单位:秒(5s-60s)
    */
    public int              nMinDuration;
    /**
     * 重复报警间隔,单位：秒
    */
    public int              nReportInterval;
    /**
     * 灵敏度, 值越小灵敏度越低, 取值1-10
    */
    public int              nSensitivity;
    /**
     * 规则特定的尺寸过滤器,参见结构体定义 {@link com.netsdk.lib.structure.NET_CFG_SIZEFILTER_INFO}
    */
    public NET_CFG_SIZEFILTER_INFO stuSizeFilter = new NET_CFG_SIZEFILTER_INFO();
    /**
     * 保留字节
    */
    public byte[]           szReserved = new byte[512];

    public NET_CFG_TRAPPED_IN_LIFT_DETECTION_INFO() {
        this.dwSize = this.size();
        for(int i = 0; i < stuLinkClassType.length; i++){
            stuLinkClassType[i] = new NET_LINK_CLASS_TYPE();
        }
        for(int i = 0; i < stuDetectRegion.length; i++){
            stuDetectRegion[i] = new NET_POINT_EX();
        }
        for(int i = 0; i < stuDetectLine.length; i++){
            stuDetectLine[i] = new NET_POINT_EX();
        }
    }
}

