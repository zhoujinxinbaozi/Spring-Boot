package com.zhoujinxin.controller;

import com.zhoujinxin.model.User;
import com.zhoujinxin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 用于定义控制器类
@EnableAutoConfiguration
public class TestController {

    @Autowired
    TestService testService;

    @ResponseBody // 直接将内容写入到body中，而不是跳转页面
    @RequestMapping(value = "/getString") // 访问路径
    public String getString(){
        User user1 = testService.getUser();
        User user2 = testService.getUser();
        if(user1 != null || user2 != null){
            System.out.println(user1 == user2);
        }else{
            System.out.println("is null");
        }
        return "hello word";
    }

    @RequestMapping(value = "/success")
    public String success(){
        return "success";
    }
}
