package io.github.ordinarykai.dto.request;

import io.github.ordinarykai.enums.VendorType;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Map;

/**
 * 基础请求参数
 *
 * @author ordinarykai
 */
@Data
public class DeviceBaseRequest {

    /**
     * 设备登录会话uuid
     */
    @NotBlank
    private String sessionUuid;
    /**
     * 厂商类型
     */
    private VendorType vendorType;
    /**
     * 厂商扩展参数
     */
    private Map<String, Object> extendedParams;

}
