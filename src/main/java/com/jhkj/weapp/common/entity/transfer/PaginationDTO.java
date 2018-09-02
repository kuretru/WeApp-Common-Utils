package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("分页参数传入实体")
@Data
public class PaginationDTO {

    @ApiModelProperty(value = "分页号(0为第一页)", position = 1)
    private Integer page;

    @ApiModelProperty(value = "每页数量", position = 2)
    private Integer limit;

}
