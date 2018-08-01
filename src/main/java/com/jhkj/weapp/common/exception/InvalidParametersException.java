package com.jhkj.weapp.common.exception;

import com.jhkj.weapp.common.util.StringUtils;

import java.util.List;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class InvalidParametersException extends Exception {

    public InvalidParametersException(String message) {
        super(message);
    }

    public InvalidParametersException(List<String> messages) {
        super(StringUtils.listToString(messages, ","));
    }

}
