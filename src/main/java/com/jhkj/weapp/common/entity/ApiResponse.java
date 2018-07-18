package com.jhkj.weapp.common.entity;

import lombok.Getter;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Getter
public class ApiResponse {

    private int code;

    private String message;

    private Object data;

    /**
     * 操作成功响应
     *
     * @param data 响应数据
     * @return 响应数据包
     */
    public static ApiResponse success(Object data) {
        return new ApiResponse(1000, "SUCCESS", data);
    }

    private ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
