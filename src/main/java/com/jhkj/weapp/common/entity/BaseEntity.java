package com.jhkj.weapp.common.entity;

import lombok.Data;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public abstract class BaseEntity {

    protected Long id;

    protected Instant createAt;

    protected Instant modifiedAt;

}
