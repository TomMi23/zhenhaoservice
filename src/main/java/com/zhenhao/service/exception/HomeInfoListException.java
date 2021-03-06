package com.zhenhao.service.exception;

import com.zhenhao.service.enums.ErrorCodeAndMsg;

import java.io.Serializable;

/**
 * 统一异常捕获类
 * Created by Tiger on 2018/10/9.
 */
public class HomeInfoListException extends RuntimeException{

    private static final long serialVersionUID = -6370612186038915645L;

    private final ErrorCodeAndMsg response;

    public HomeInfoListException(ErrorCodeAndMsg response) {
        this.response = response;
    }
    public ErrorCodeAndMsg getResponse() {
        return response;
    }
}

