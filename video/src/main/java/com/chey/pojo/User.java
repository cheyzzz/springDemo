package com.chey.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author chey
 * @Date 2021-10-25 16:02
 * @Describe javabean
 */
@Component
public class User {
//    public String name = "chey";
    @Value("chey")
    public String name;

    public User() {
        System.out.println("init");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
