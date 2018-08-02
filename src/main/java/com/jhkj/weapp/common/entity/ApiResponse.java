package com.jhkj.weapp.common.entity;

import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public class ApiResponse {

    private int code;

    private String message;

    private Object data;

    public static final int SUCCESS = 1000;
    public static final int CREATED = 2001;
    public static final int UPDATED = 2002;
    public static final int DELETED = 2003;
    public static final int MISSING_PARAMETERS = 4001;
    public static final int INVALID_PARAMETERS = 4002;
    public static final int NOT_FOUND = 4003;
    public static final int USER_UNAUTHORIZED = 5001;
    public static final int ADMIN_UNAUTHORIZED = 5002;
    public static final int UNKNOWN = 6000;
    public static final String SUCCESS_MESSAGE = "success";
    public static final String CREATED_MESSAGE = "created";
    public static final String UPDATED_MESSAGE = "updated";
    public static final String DELETED_MESSAGE = "deleted";
    public static final String MISSING_PARAMETERS_MESSAGE = "missing parameters";
    public static final String INVALID_PARAMETERS_MESSAGE = "invalid parameters";
    public static final String NOT_FOUND_MESSAGE = "data not found";
    public static final String USER_UNAUTHORIZED_MESSAGE = "user unauthorized";
    public static final String ADMIN_UNAUTHORIZED_MESSAGE = "admin unauthorized";
    public static final String UNKNOWN_MESSAGE = "unknown error";

    public static ApiResponse success(Object data) {
        return new ApiResponse(SUCCESS, SUCCESS_MESSAGE, data);
    }

    public static ApiResponse created(Object data) {
        return new ApiResponse(CREATED, CREATED_MESSAGE, data);
    }

    public static ApiResponse created(String data) {
        return new ApiResponse(CREATED, CREATED_MESSAGE, data + "数据创建成功");
    }

    public static ApiResponse updated(Object data) {
        return new ApiResponse(UPDATED, UPDATED_MESSAGE, data);
    }

    public static ApiResponse updated(String data) {
        return new ApiResponse(UPDATED, UPDATED_MESSAGE, data + "数据更新成功");
    }

    public static ApiResponse deleted(Object data) {
        return new ApiResponse(DELETED, DELETED_MESSAGE, data);
    }

    public static ApiResponse deleted(String data) {
        return new ApiResponse(DELETED, DELETED_MESSAGE, data + "数据删除成功");
    }

    public static ApiResponse missingParameters(String data) {
        return new ApiResponse(MISSING_PARAMETERS, MISSING_PARAMETERS_MESSAGE, "缺少参数：" + data);
    }

    public static ApiResponse invalidParameters(String data) {
        return new ApiResponse(INVALID_PARAMETERS, INVALID_PARAMETERS_MESSAGE, "无效参数：" + data);
    }

    public static ApiResponse dataNotFound(String data) {
        return new ApiResponse(NOT_FOUND, NOT_FOUND_MESSAGE, "数据未找到：" + data);
    }

    public static ApiResponse userUnauthenticated(String data) {
        return new ApiResponse(USER_UNAUTHORIZED, USER_UNAUTHORIZED_MESSAGE, "API身份认证失败：" + data);
    }

    public static ApiResponse adminUnauthenticated(String data) {
        return new ApiResponse(ADMIN_UNAUTHORIZED, ADMIN_UNAUTHORIZED_MESSAGE, "管理员身份认证失败：" + data);
    }

    public static ApiResponse unknown() {
        return new ApiResponse(UNKNOWN, UNKNOWN_MESSAGE, "未知错误，请联系开发人员");
    }

    public static ApiResponse unknown(String data) {
        return new ApiResponse(UNKNOWN, UNKNOWN_MESSAGE, "未知错误，请联系开发人员，异常信息：" + data);
    }

    private ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
