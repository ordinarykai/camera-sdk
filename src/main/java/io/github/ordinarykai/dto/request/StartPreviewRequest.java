package io.github.ordinarykai.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 视频预览请求参数
 *
 * @author ordinarykai
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StartPreviewRequest extends DeviceBaseRequest {

    /**
     * 通道号
     */
    private Integer channelNo = 1;

}
