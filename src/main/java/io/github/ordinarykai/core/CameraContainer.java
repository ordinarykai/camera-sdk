package io.github.ordinarykai.core;

import com.netsdk.lib.NetSDKLib;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 设备容器
 *
 * @author ordinarykai
 */
public class CameraContainer {

  /**
   * 登录句柄
   */
  public static final ConcurrentHashMap<String, NetSDKLib.LLong> LOGIN_HANDLE_MAP = new ConcurrentHashMap<>();
  /**
   * 监控句柄
   */
  public static final ConcurrentHashMap<String, NetSDKLib.LLong> PLAY_HANDLE_MAP = new ConcurrentHashMap<>();

}
