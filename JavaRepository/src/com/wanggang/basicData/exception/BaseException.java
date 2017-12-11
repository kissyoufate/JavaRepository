package com.wanggang.basicData.exception;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : 自定义的异常类 继承 Exception 并重写父类相关的方法
 */
public class BaseException extends Exception {

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
