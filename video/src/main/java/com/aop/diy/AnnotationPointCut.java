package com.aop.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author chey
 * @Date 2021-10-28 15:19
 * @Describe   AOP法三  注解实现
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.aop.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }
    @After("execution(* com.aop.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }
    @Around("execution(* com.aop.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around 1");
        Object proceed = joinPoint.proceed();
        System.out.println("around 2");
    }

}
