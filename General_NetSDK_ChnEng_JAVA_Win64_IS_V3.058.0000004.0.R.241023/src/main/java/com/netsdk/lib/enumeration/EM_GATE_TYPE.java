package com.netsdk.lib.enumeration;

/**
 * @author 47081
 * @version 1.0
 * @description 闸机类型
 * @date 2021/2/7
 */
public enum EM_GATE_TYPE {
  /** 未知 */
    EM_ASG_GATE_TYPE_UNKNOWN(-1, "未知"),
  /** 摆闸1 */
    EM_ASG_GATE_TYPE_SWING_GATE_ONE(0, "摆闸1"),
  /** 摆闸2 */
    EM_ASG_GATE_TYPE_SWING_GATE_TWO(1, "摆闸2"),
  /** 翼闸1 */
    EM_ASG_GATE_TYPE_WING_GATE_ONE(2, "翼闸1"),
  /** 翼闸2 */
    EM_ASG_GATE_TYPE_WING_GATE_TWO(3, "翼闸2"),
  /** 翼闸3 */
    EM_ASG_GATE_TYPE_WING_GATE_THREE(4, "翼闸3"),
  /** 三棍闸1 */
    EM_ASG_GATE_TYPE_THREE_STICK_GATE_ONE(10, "三棍闸1"),
  /** 三棍闸2 */
    EM_ASG_GATE_TYPE_THREE_STICK_GATE_TWO(11, "三棍闸2"),
  /** 摆闸3 */
    EM_ASG_GATE_TYPE_SWING_GATE_THREE(20, "摆闸3"),
  /** 摆闸4 */
    EM_ASG_GATE_TYPE_SWING_GATE_FOUR(21, "摆闸4"),
  /** 摆闸5 */
    EM_ASG_GATE_TYPE_SWING_GATE_FIVE(22, "摆闸5");

  private int type;
  private String desc;

  EM_GATE_TYPE(int type, String desc) {
    this.type = type;
    this.desc = desc;
  }

  public static EM_GATE_TYPE getGateType(int type) {
    for (EM_GATE_TYPE gateType : EM_GATE_TYPE.values()) {
      if (gateType.type == type) {
        return gateType;
      }
    }
    return EM_ASG_GATE_TYPE_UNKNOWN;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
}

