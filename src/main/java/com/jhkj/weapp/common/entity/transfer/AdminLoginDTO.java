package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("管理员登录传入实体")
@Data
public class AdminLoginDTO {

    @ApiModelProperty(value = "用户名", position = 1, required = true)
    private String username;

    @ApiModelProperty(value = "密码", position = 2, required = true)
    private String password;

}
