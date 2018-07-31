package com.jhkj.weapp.common.entity.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OptionCityDO extends OptionProvinceDO {

    protected Integer provinceId;

}
