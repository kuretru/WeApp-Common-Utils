package com.jhkj.weapp.common.entity;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public abstract class BaseEntity {

    protected Long id;

    protected Instant createAt;

    protected Instant modifiedAt;

}
