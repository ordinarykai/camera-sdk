package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * 事件类型EVENT_IVS_STEREO_FIGHTDETECTION(立体行为分析打架/剧烈运动检测)对应的规则配置
*/
public class CFG_IVS_STEREO_FIGHTDETECTION_INFO extends NetSDKLib.SdkStructure
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
     * 灵敏度, 1-10, 默认值5
    */
    public int              nSensitivity;
    /**
     * 最大检测高度,单位cm
    */
    public int              nMaxHeight;
    /**
     * 最小检测高度,单位cm
    */
    public int              nMinHeight;
    /**
     * 动作类型,参见枚举定义 {@link com.netsdk.lib.enumeration.EM_CFG_ACTION_TYPE}
    */
    public int              emActionType;
    /**
     * 保留字节
    */
    public byte[]           bReserved = new byte[508];

    public CFG_IVS_STEREO_FIGHTDETECTION_INFO() {
        for(int i = 0; i < stuTimeSection.length; i++){
            stuTimeSection[i] = new CFG_TIME_SECTION_ARRAY_10();
        }
        for(int i = 0; i < stuDetectRegion.length; i++){
            stuDetectRegion[i] = new NetSDKLib.CFG_POLYGON();
        }
    }
}

