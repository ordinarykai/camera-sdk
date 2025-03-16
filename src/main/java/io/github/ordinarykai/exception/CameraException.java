package io.github.ordinarykai.exception;

import lombok.Getter;

/**
 * 摄像头异常基类
 *
 * @author ordinarykai
 */
@Getter
public class CameraException extends RuntimeException {

    private final ErrorCode errorCode;

    public CameraException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public CameraException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

}

