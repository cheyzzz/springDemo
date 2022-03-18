package com.proxy;

/**
 * @Author chey
 * @Date 2021-10-26 16:23
 * @Describe 代理角色 创建真实角色对象实现动作
 */
public class UserServiceProxy implements UserService{
    UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void del() {
        log("del");
        userService.del();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
    public void log(String msg){
        System.out.println("debug"+msg);
    }
}
