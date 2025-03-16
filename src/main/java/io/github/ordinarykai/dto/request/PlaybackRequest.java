package io.github.ordinarykai.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 录像回放请求
 *
 * @author ordinarykai
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PlaybackRequest extends DeviceBaseRequest {

    /**
     * 通道号
     */
    private Integer channelNo = 1;

    /**
     * 录像开始时间
     */
    private LocalDateTime startTime;
    /**
     * 录像结束时间
     */
    private LocalDateTime endTime;

}
