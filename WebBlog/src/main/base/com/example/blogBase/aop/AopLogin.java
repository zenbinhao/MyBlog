package com.example.blogBase.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//目标注解在方法上
@Target(ElementType.METHOD)
//运行时生效
@Retention(RetentionPolicy.RUNTIME)
public @interface AopLogin {
    //声明参数  以下不是方法
    //参数类型 参数名 默认值
    boolean isInterceptor() default false;
    //是否拦截
}
