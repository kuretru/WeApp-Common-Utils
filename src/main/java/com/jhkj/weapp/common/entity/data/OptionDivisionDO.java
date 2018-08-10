package com.jhkj.weapp.common.entity.data;

import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public class OptionDivisionDO {

    private String id;

    private String province;

    private String city;

    private String area;

    public String toAddressString() {
        return province + " " + ("市辖区".equals(city) ? "" : city + " ") + area + " ";
    }

}
