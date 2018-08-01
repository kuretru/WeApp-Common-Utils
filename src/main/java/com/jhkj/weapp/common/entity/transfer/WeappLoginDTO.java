package com.jhkj.weapp.common.entity.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@ApiModel("微信小程序登录请求数据包")
@Data
public class WeappLoginDTO {

    @ApiModelProperty("临时登录凭证")
    private String code;

}
