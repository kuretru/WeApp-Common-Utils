package com.jhkj.weapp.common.entity.view;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jhkj.weapp.common.util.InstantUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("用户信息传出实体")
@Data
public class UserVO {

    @ApiModelProperty(value = "用户API调用令牌", position = 1)
    private String userToken;

    @ApiModelProperty(value = "用户ID", position = 2)
    private Long id;

    @ApiModelProperty(value = "用户昵称", position = 3)
    private String nickName;

    @ApiModelProperty(value = "用户头像地址", position = 4)
    private String avatarUrl;

    @ApiModelProperty(value = "用户性别(0:未知,1:男性,2:女性)", position = 5)
    private Integer gender;

    @ApiModelProperty(value = "用户上一次登录的时间", position = 6)
    @JsonFormat(pattern = InstantUtils.GENERAL_DATE_FORMAT, timezone = InstantUtils.GENERAL_TIME_ZONE)
    private Instant lastLogin;

    @ApiModelProperty(value = "用户所在的城市", position = 7)
    private String city;

    @ApiModelProperty(value = "用户所在的省份", position = 8)
    private String province;

    @ApiModelProperty(value = "用户所在的国家", position = 9)
    private String country;

    @ApiModelProperty(value = "用户的语言", position = 10)
    private String language;

}
