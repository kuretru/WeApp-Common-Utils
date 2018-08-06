package com.jhkj.weapp.common.entity.data;

import lombok.Data;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public abstract class BaseDO {

    protected Long id;

    protected Instant createAt;

    protected Instant modifiedAt;

}
