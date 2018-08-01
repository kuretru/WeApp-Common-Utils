package com.jhkj.weapp.common.exception;

import com.jhkj.weapp.common.util.StringUtils;

import java.util.List;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class MissingParametersException extends Exception {

    public MissingParametersException(String message) {
        super(message);
    }

    public MissingParametersException(List<String> messages) {
        super(StringUtils.listToString(messages, ","));
    }

}
