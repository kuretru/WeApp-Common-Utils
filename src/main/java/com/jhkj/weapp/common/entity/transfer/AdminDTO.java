package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("管理员信息传入实体")
@Data
public class AdminDTO {

    @ApiModelProperty(value = "用户名", position = 1, required = true)
    private String username;

    @ApiModelProperty(value = "密码", position = 2, required = true)
    private String password;

    @ApiModelProperty(value = "管理员昵称", position = 3, required = true)
    private String nickName;

    @ApiModelProperty(value = "管理员等级", position = 4)
    private Integer level;

}
