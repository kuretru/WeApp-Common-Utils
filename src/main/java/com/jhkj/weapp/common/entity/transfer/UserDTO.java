package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("用户信息传入实体")
@Data
public class UserDTO {

    @ApiModelProperty(value = "用户昵称", position = 1, required = true)
    private String nickName;

    @ApiModelProperty(value = "用户头像地址", position = 2, required = true)
    private String avatarUrl;

    @ApiModelProperty(value = "用户性别(0:未知,1:男性,2:女性)", position = 3)
    private Integer gender;

    @ApiModelProperty(value = "用户所在的城市", position = 4)
    private String city;

    @ApiModelProperty(value = "用户所在的省份", position = 5)
    private String province;

    @ApiModelProperty(value = "用户所在的国家", position = 6)
    private String country;

    @ApiModelProperty(value = "用户的语言", position = 7)
    private String language;

}
