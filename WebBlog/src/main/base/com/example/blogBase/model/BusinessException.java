package com.example.blogBase.model;

import com.example.blogBase.em.ExceptionEnum;
import lombok.Data;


@Data
public class BusinessException extends RuntimeException{
    //  返回给前端的  异常错误码   可乱编
    private int code;
    //  返回给前端的  异常错误信息  可乱编
    private String message;

    // 给实体自定义异常消息
    public BusinessException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    //也可自定义枚举类  待开发
    public BusinessException(ExceptionEnum exceptionEnum){
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }
}
