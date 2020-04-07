package com.jianer.springaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 杨兴健
 * @Date 2020/4/7 17:32
 */
@Component
@Aspect
public class MyLog {

    @After("execution(* com.jianer.springaop.service.UserService.findAll(..))")
    public void sayHello() {
        System.out.println("hello,world!");
    }

    @Before("execution(* com.jianer.springaop.service.UserService.insert(..))")
    public void before() {
        System.out.println("插入数据之前");
    }
}
