package com.haeyden.controller;

import com.haeyden.config.SpringConfiguration;
import com.haeyden.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Client {
    public static void main(String[] args) {
        //通过注解配置获取容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //获取 accountService
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.save();
    }
}

