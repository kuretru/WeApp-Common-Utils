package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("修改管理员信息传入实体")
@Data
public class AdminUpdateDTO {

    @ApiModelProperty(value = "用户名", position = 1)
    private String username;

    @ApiModelProperty(value = "管理员昵称", position = 2)
    private String nickName;

    @ApiModelProperty(value = "管理员等级", position = 3)
    private Integer level;

}
