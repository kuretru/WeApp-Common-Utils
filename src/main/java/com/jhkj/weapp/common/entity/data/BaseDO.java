package com.jhkj.weapp.common.entity.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jhkj.weapp.common.util.InstantUtils;
import lombok.Data;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public abstract class BaseDO {

    protected Long id;

    @JsonFormat(pattern = InstantUtils.GENERAL_DATE_FORMAT, timezone = InstantUtils.GENERAL_TIME_ZONE)
    protected Instant createAt;

    @JsonFormat(pattern = InstantUtils.GENERAL_DATE_FORMAT, timezone = InstantUtils.GENERAL_TIME_ZONE)
    protected Instant modifiedAt;

}
