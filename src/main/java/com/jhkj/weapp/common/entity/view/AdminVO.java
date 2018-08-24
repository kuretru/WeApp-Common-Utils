package com.jhkj.weapp.common.entity.view;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jhkj.weapp.common.entity.data.AdminDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("管理员信息传出实体")
@Data
public class AdminVO {

    @ApiModelProperty(value = "管理员ID", position = 1)
    private Long id;

    @ApiModelProperty(value = "管理员昵称", position = 2)
    private String nickName;

    @ApiModelProperty(value = "管理员等级", position = 3)
    private Integer level;

    @ApiModelProperty(value = "管理员上一次登录的时间", position = 4)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Instant lastLogin;

    public AdminVO(@NonNull AdminDO adminDO) {
        this.id = adminDO.getId();
        this.nickName = adminDO.getNickName();
        this.level = adminDO.getLevel();
        this.lastLogin = adminDO.getLastLogin();
    }

    public AdminVO() {
        super();
    }

}
