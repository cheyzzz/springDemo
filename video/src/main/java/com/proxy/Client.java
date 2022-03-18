package com.proxy;

/**
 * @Author chey
 * @Date 2021-10-26 16:22
 * @Describe
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
