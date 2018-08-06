package com.jhkj.weapp.common.entity.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("管理员信息传出实体")
@Data
public class AdminVO {

    @ApiModelProperty(value = "管理员ID", position = 1)
    private Long id;

    @ApiModelProperty(value = "管理员昵称", position = 3)
    private String nickName;

    @ApiModelProperty(value = "管理员等级", position = 4)
    private Integer level;

    @ApiModelProperty(value = "管理员上一次登录的时间", position = 5)
    private Instant lastLogin;

}
