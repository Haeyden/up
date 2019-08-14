package com.haeyden.controller;

import com.haeyden.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //根据ID获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        System.out.println(accountService);

        accountService.deleteAccount();

    }
}
