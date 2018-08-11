package com.jhkj.weapp.common.entity.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("附带用户Token信息传出实体")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserTokenVO extends UserVO {

    @ApiModelProperty(value = "用户API调用令牌", position = 1)
    private String userToken;

}
