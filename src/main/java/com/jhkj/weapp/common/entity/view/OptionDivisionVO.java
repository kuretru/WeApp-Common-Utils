package com.jhkj.weapp.common.entity.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("行政规划信息传出实体")
@Data
public class OptionDivisionVO {

    @ApiModelProperty(value = "省份/城市/区域ID", position = 1)
    private Integer id;

    @ApiModelProperty(value = "省份/城市/区域名称", position = 2)
    private String name;

}
