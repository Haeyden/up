package com.haeyden.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;

@Component("logger")
//表示当前类是一个配置类
@Aspect
public class Logger {

    /**
     * 前置通知
     */
    @Before("execution(* com.haeyden.service.impl.*.*(..))")
    public void beforePrinting() {
        System.out.println("Logger 前置通知执行: beforePrinting...");
    }

    /**
     * 后置通知
     */
    @AfterReturning("execution(* com.haeyden.service.impl.*.*(..))")
    public void afterPrinting() {
        System.out.println("Logger 后置通知执行: afterReturningPrinting...");
    }

    /**
     * 异常通知
     */
    @AfterThrowing("execution(* com.haeyden.service.impl.*.*(..))")
    public void throwingPrinting() {
        System.out.println("Logger 异常通知执行: throwingPrinting...");
    }

    /**
     * 把当前方法看成是最终通知
     * value：用于指定切入点表达式，还可以指定切入点表达式的引用
     */
    @After("execution(* com.haeyden.service.impl.*.*(..))")
    public void afterPrintLog() {
        System.out.println("Logger 最终通知执行: afterPrinting...");
    }
    /**
     * 环绕通知
     */
    @Around("execution(* com.haeyden.service.impl.*.*(..))")
    public void aroundPrintLog(ProceedingJoinPoint point){

        try {
            //前置通知
            System.out.println("Logger 环绕通知前置执行: aroundBeforePrinting...");
            //明确方法调用
            point.proceed();
            //后置通知
            System.out.println("Logger 环绕通知后置执行: aroundAfterPrinting...");
        } catch (Throwable e) {
            System.out.println("Logger 环绕通知异常执行: aroundThrowPrinting...");
            e.printStackTrace();
        }finally {
            System.out.println("Logger 环绕通知最终通知执行: aroundPrinting...");
        }
    }

}
