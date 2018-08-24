package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("修改管理员密码传入实体")
@Data
public class AdminChangePasswordDTO {

    @ApiModelProperty(value = "旧密码", position = 1, required = true)
    private String oldPassword;

    @ApiModelProperty(value = "新密码", position = 2, required = true)
    private String newPassword;

}
