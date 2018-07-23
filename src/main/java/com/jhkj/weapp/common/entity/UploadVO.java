package com.jhkj.weapp.common.entity;

import lombok.Data;

import java.util.List;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public class UploadVO {

    private String caller;

    private String secret;

    private List<String> originalFiles;

    private static final String SECRET_KEY = "VZ6xwHkntoPb";

    public boolean verify() {
        return (caller + SECRET_KEY).equals(secret);
    }

}
