package io.github.ordinarykai.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 停止视频预览请求参数
 *
 * @author ordinarykai
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StopPreviewRequest extends DeviceBaseRequest {

    /**
     * 视频流id
     */
    private String streamId;

}
