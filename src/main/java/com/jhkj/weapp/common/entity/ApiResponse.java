package com.jhkj.weapp.common.entity;

import com.jhkj.weapp.common.util.StringUtils;
import lombok.Getter;

import java.util.List;

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
        return new ApiResponse(1000, "success", data);
    }

    public static ApiResponse created(Object data) {
        return new ApiResponse(2001, "created", data);
    }

    public static ApiResponse created(String data) {
        return new ApiResponse(2001, "created", data + "数据创建成功");
    }

    public static ApiResponse updated(Object data) {
        return new ApiResponse(2002, "updated", data);
    }

    public static ApiResponse updated(String data) {
        return new ApiResponse(2002, "updated", data + "数据更新成功");
    }

    public static ApiResponse deleted(Object data) {
        return new ApiResponse(2003, "deleted", data);
    }

    public static ApiResponse deleted(String data) {
        return new ApiResponse(2003, "deleted", data + "数据删除成功");
    }

    public static ApiResponse missingParameters(String data) {
        return new ApiResponse(4001, "missing parameters", "缺少参数：" + data);
    }

    public static ApiResponse missingParameters(List<String> data) {
        return new ApiResponse(4001, "missing parameters",
                "缺少参数：" + StringUtils.listToString(data, ","));
    }

    public static ApiResponse invalidParameters(String data) {
        return new ApiResponse(4002, "invalid parameters", "无效参数：" + data);
    }

    public static ApiResponse invalidParameters(List<String> data) {
        return new ApiResponse(4002, "invalid parameters",
                "无效参数：" + StringUtils.listToString(data, ","));
    }

    public static ApiResponse dataNotFound(String data) {
        return new ApiResponse(4003, "data not found", "数据未找到");
    }

    public static ApiResponse userUnauthorized(String data) {
        return new ApiResponse(5001, "user unauthorized", "API身份认证失败：" + data);
    }

    public static ApiResponse adminUnauthorized(String data) {
        return new ApiResponse(5002, "admin unauthorized", "管理员身份认证失败：" + data);
    }

    public static ApiResponse unknown() {
        return new ApiResponse(6000, "unknown error", "未知错误，请联系开发人员");
    }

    public static ApiResponse unknown(String data) {
        return new ApiResponse(6000, "unknown error", "未知错误，请联系开发人员，异常信息：" + data);
    }

    private ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
