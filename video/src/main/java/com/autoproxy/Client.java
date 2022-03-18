package com.autoproxy;


/**
 * @Author chey
 * @Date 2021-10-26 16:22
 * @Describe
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();//创建实现类对象
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        proxyInvocationHandler.setUserService(userService);//设置要代理的的对象 为实现类对象

        UserService proxy = (UserService) proxyInvocationHandler.getProxy();//动态生成代理类 类型为实现类的接口
        proxy.add();//代理实现实现类的动作  利用反射 将方法传到代理的method
    }
}
