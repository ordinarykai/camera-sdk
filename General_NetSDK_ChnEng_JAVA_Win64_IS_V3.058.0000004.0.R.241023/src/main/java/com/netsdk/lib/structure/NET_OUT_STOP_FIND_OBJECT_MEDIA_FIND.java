package com.netsdk.lib.structure;
import com.netsdk.lib.NetSDKLib;
/**
 * CLIENT_StopFindObjectMediaFind 接口输出参数
*/
public class NET_OUT_STOP_FIND_OBJECT_MEDIA_FIND extends NetSDKLib.SdkStructure
{
    /**
     * 此结构体大小,必须赋值
    */
    public int              dwSize;

    public NET_OUT_STOP_FIND_OBJECT_MEDIA_FIND() {
        this.dwSize = this.size();
    }
}

