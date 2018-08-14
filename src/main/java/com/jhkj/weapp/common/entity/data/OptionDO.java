package com.jhkj.weapp.common.entity.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OptionDO extends BaseDO {

    private String key;

    private String value;

    public OptionDO(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public OptionDO() {
        super();
    }

}
