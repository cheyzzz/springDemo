package com.chey.config;

import com.chey.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chey
 * @Date 2021-10-25 16:39
 * @Describe java configure
 */
@Configuration
@ComponentScan("com.chey.pojo")
public class Myconfig {
    @Bean
    public User user(){
        return new User();
    }
}
