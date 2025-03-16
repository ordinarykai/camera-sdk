package com.netsdk.lib.enumeration;
import com.netsdk.lib.NetSDKLib;
/**
 * 是否有斜挎包
*/
public enum EM_HAS_MESSENGER_BAG
{
    /**
     * 未知
    */
    EM_HAS_MESSENGER_BAG_UNKNOWN(0, "未知"),
    /**
     * 没有斜挎包
    */
    EM_HAS_MESSENGER_BAG_NO(1, "没有斜挎包"),
    /**
     * 有斜挎包
    */
    EM_HAS_MESSENGER_BAG_YES(2, "有斜挎包");

    private int value;
    private String note;

    public String getNote() {
        return note;
    }

    public int getValue() {
        return value;
    }

    EM_HAS_MESSENGER_BAG(int givenValue, String note) {
        this.value = givenValue;
        this.note = note;
    }

    public static String getNoteByValue(int givenValue) {
        for (EM_HAS_MESSENGER_BAG enumType : EM_HAS_MESSENGER_BAG.values()) {
            if (givenValue == enumType.getValue()) {
                return enumType.getNote();
            }
        }
        return null;
    }

    public static int getValueByNote(String givenNote) {
        for (EM_HAS_MESSENGER_BAG enumType : EM_HAS_MESSENGER_BAG.values()) {
            if (givenNote.equals(enumType.getNote())) {
                return enumType.getValue();
            }
        }
        return -1;
    }
}

