package com.autoproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author chey
 * @Date 2021-10-27 16:15
 * @Describe 动态代理
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private UserService userService;//要代理的类的接口

    //传入要代理的类的接口
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    //新建代理类并获取
    public Object getProxy(){
        // loader interface InvocationHandler
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), userService.getClass().getInterfaces(),this);
    }

    //接收到动作 反射处理代理实例 执行对象动作 返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(userService, args);//传入对象和其他参数
        return invoke;
    }
}
