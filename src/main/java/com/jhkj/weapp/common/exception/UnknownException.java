package com.jhkj.weapp.common.exception;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class UnknownException extends Exception {

    public UnknownException() {
        super("");
    }

    public UnknownException(String message) {
        super(message);
    }

}
