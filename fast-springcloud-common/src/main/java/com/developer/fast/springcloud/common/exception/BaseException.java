package com.developer.fast.springcloud.common.exception;

/**
 * @Description:
 * @Author: shuai.chen
 * @Date: 2019/9/16 08:52
 */
public class BaseException extends RuntimeException{

    private String message;

    public BaseException(String message) {
        this.message = message;
    }

    public BaseException(String message, Throwable cause) {
        super(cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
