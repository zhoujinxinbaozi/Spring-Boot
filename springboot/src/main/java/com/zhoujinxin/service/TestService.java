package com.zhoujinxin.service;

import com.zhoujinxin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@EnableAutoConfiguration
@Service
public class TestService {

    @Autowired
    public User user;

    public User getUser(){
        return user;
    }
}
