package com.zhoujinxin.config;

import com.zhoujinxin.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean(name = "user")
    @Scope("prototype") // @Scope("prototype") 多例，默认单例
    public User getUser(){
        return new User();
    }
}
