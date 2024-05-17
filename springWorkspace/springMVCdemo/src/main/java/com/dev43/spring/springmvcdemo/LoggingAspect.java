package com.dev43.spring.springmvcdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public * com.dev43.spring.springmvcdemo.HomeController.getUsers())")
    public void log(){
        System.out.println("getUsers() method called from Aspect");
    }
}
