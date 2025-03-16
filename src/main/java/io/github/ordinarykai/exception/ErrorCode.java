package io.github.ordinarykai.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误码枚举
 *
 * @author ordinarykai
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {

    DEVICE_CONNECTION_FAILED(110_1001, "设备连接失败"),

    AUTHENTICATION_FAILURE(110_1002, "认证失败"),

    COMMAND_NOT_SUPPORTED(110_1003, "指令不支持"),

    STREAM_TIMEOUT(110_1004, "流获取超时"),

    START_PREVIEW_FAIL(110_1005, "开启预览失败"),

    LOGIN_HANDLE_NOT_FOUND(110_1006, "登录句柄不存在"),

    FFMPEG_START_FAILED(110_1007, "FFMPEG命令执行失败"),

    ;

    private final int code;

    private final String message;

}
