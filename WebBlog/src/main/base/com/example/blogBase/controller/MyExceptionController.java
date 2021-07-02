package com.example.blogBase.controller;

import com.example.blogBase.em.ExceptionEnum;
import com.example.blogBase.model.BusinessException;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionController {

    // 处理手动抛出的自定义异常
    @ExceptionHandler(BusinessException.class)
    public BusinessException businessException(BusinessException be){
        return be;
    }

    // 统一处理未 手动抛出的自定义异常
    @ExceptionHandler(Exception.class)
    public BusinessException businessException(){
        BusinessException be = new BusinessException(ExceptionEnum.SYS_ERROR);
        return be;
    }
}
