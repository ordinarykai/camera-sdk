package io.github.ordinarykai.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 视频流信息
 *
 * @author ordinarykai
 */
@Data
@Accessors(chain = true)
public class StreamResponse {

    /**
     * 视频流id
     */
    private String streamId;

}
