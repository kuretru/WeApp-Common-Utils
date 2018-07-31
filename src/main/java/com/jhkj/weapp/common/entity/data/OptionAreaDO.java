package com.jhkj.weapp.common.entity.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OptionAreaDO extends OptionCityDO {

    protected Integer cityId;

}
