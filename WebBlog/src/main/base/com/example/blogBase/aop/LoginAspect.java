package com.example.blogBase.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {


    //声明切入点
    @Pointcut("execution(* com.example.webblog.service.impl.*(..))")
    public void pointCut(){

    }

    //通过注解标记->切入点前置增强
    @Before("pointCut()&&@annotation(aopLogin)")
    public void doBefore(JoinPoint joinPoint,AopLogin aopLogin){

    }
    //通过注解标记->切入点后置增强
    @After("pointCut()&&@annotation(aopLogin)")
    public void doAfter(JoinPoint joinPoint,AopLogin aopLogin){

    }
}
