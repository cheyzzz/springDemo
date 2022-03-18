package com.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author chey
 * @Date 2021-10-27 18:43
 * @Describe AOP法一  使用自带的API   新建类实现MethodBeforeAdvice
 */
public class LogBefore implements MethodBeforeAdvice {
    //method要执行的对象的方法  target对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"  "+method.getName()+"执行了");
    }
}
