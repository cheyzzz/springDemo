package com.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author chey
 * @Date 2021-10-27 18:51
 * @Describe  AOP法一  使用自带的API   新建类实现AfterReturningAdvice
 */
public class LogAfter implements AfterReturningAdvice {

    //带返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"  返回值为"+returnValue);
    }
}
