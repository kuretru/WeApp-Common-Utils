package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("管理员修改密码传入实体")
@Data
public class AdminChangePasswordDTO {

    @ApiModelProperty(value = "用户名", position = 1, required = true)
    private String username;

    @ApiModelProperty(value = "旧密码", position = 2, required = true)
    private String oldPassword;

    @ApiModelProperty(value = "新密码", position = 3, required = true)
    private String newPassword;

}
