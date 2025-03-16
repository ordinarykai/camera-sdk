package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 事件类型EVENT_IVS_STEREO_MANNUM_DETECTION(立体行为分析人数异常检测)对应的规则配置
*/
public class CFG_IVS_STEREO_MANNUM_DETECTION_INFO extends NetSDKLib.SdkStructure
{
    /**
     * 信息
    */
    public byte[]           szRuleName = new byte[128];
    /**
     * 规则名称,不同规则不能重名
    */
    public int              bRuleEnable;
    /**
     * 规则使能
    */
    public byte             bTrackEnable;
    /**
     * 触发跟踪使能,仅对绊线，入侵规则有效
    */
    public byte[]           bReserved1 = new byte[3];
    /**
     * 保留字段
    */
    public int              nObjectTypeNum;
    /**
     * 相应物体类型个数
    */
    public BYTE_ARRAY_128[] szObjectTypes = new BYTE_ARRAY_128[16];
    /**
     * 相应物体类型列表,参见结构体定义 {@link com.netsdk.lib.NetSDKLib.CFG_ALARM_MSG_HANDLE}
    */
    public NetSDKLib.CFG_ALARM_MSG_HANDLE stuEventHandler = new NetSDKLib.CFG_ALARM_MSG_HANDLE();
    /**
     * 报警联动,参见结构体定义 {@link com.netsdk.lib.structure.CFG_TIME_SECTION}
    */
    public CFG_TIME_SECTION_ARRAY_10[] stuTimeSection = new CFG_TIME_SECTION_ARRAY_10[7];
    /**
     * 事件响应时间段
    */
    public int              nPtzPresetId;
    /**
     * 检测区域顶点数
    */
    public int              nDetectRegionPoint;
    /**
     * 检测区域,参见结构体定义 {@link com.netsdk.lib.NetSDKLib.CFG_POLYGON}
    */
    public NetSDKLib.CFG_POLYGON[] stuDetectRegion = new NetSDKLib.CFG_POLYGON[20];
    /**
     * 最短持续时间, 单位是秒,低于该时间不报警, 默认2, 范围[1,60]
    */
    public int              nMinDuration;
    /**
     * 重复报警时间, 单位：秒, 为0不重复报警, 默认0, 范围[0,300]
    */
    public int              nReportInterval;
    /**
     * 灵敏度, 1-10, 默认5
    */
    public int              nSensitivity;
    /**
     * 最小检测高度,单位cm
    */
    public int              nMinHeight;
    /**
     * 最大检测高度,单位cm
    */
    public int              nMaxHeight;
    /**
     * 检测模式, 取值：0-大于阈值报警 1-小于阈值报警 2-不等于阈值报警 3-等于阈值报警
    */
    public int              nDetectType;
    /**
     * 报警人数阈值, 取值0-10，默认值2
    */
    public int              nThresholdPerson;
    /**
     * 保留字节
    */
    public byte[]           bReserved = new byte[512];

    public CFG_IVS_STEREO_MANNUM_DETECTION_INFO() {
        for(int i = 0; i < stuTimeSection.length; i++){
            stuTimeSection[i] = new CFG_TIME_SECTION_ARRAY_10();
        }
        for(int i = 0; i < stuDetectRegion.length; i++){
            stuDetectRegion[i] = new NetSDKLib.CFG_POLYGON();
        }
    }
}

