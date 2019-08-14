package com.haeyden.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//表明是配置类
@Configuration
//自动扫描包
@ComponentScan("com.haeyden")
//开启AOP
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
