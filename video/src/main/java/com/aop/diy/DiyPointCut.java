package com.aop.diy;

/**
 * @Author chey
 * @Date 2021-10-28 14:59
 * @Describe  法二  自定义切面方法切入
 */
public class DiyPointCut {
    public void before(){
        System.out.println("before");
    }
    public void after(){
        System.out.println("after");
    }
}
