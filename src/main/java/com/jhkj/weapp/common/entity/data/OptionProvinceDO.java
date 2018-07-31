package com.jhkj.weapp.common.entity.data;

import com.jhkj.weapp.common.entity.view.OptionDivisionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OptionProvinceDO {

    protected Integer id;

    protected String name;

    public OptionDivisionVO toVO() {
        OptionDivisionVO result = new OptionDivisionVO();
        result.setId(id);
        result.setName(name);
        return result;
    }

}
