package com.netsdk.lib.enumeration;

/**
 * @author 251823
 * @description 智能交通雷达检测汽车状态
 * @date 2020/12/14
 */
public enum EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE {
	// 未知
    EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE_UNKNOWN(-1, "未知"),
	// 无车
    EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE_NO_CAR(0, "无车"),
	// 有车
    EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE_CAR(1, "有车");

	private int value;
	private String note;

	private EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE(int givenValue, String note) {
		this.value = givenValue;
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public int getValue() {
		return value;
	}

	public static String getNoteByValue(int givenValue) {
		for (EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE enumType : EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE.values()) {
			if (givenValue == enumType.getValue()) {
				return enumType.getNote();
			}
		}
		return null;
	}

	public static int getValueByNote(String givenNote) {
		for (EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE enumType : EM_TRAFFIC_SNAP_RADAR_DETECT_CAR_STATE.values()) {
			if (givenNote.equals(enumType.getNote())) {
				return enumType.getValue();
			}
		}
		return -2;
	}
}

