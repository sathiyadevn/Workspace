package com.dev43.spring.springmvcdemo;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);
    @Before("execution(public * com.dev43.spring.springmvcdemo.HomeController.getUsers())")
    public void logBefore(){

        LOGGER.info("getUsers() method called from Aspect");
    }

//    @After("execution(public * com.dev43.spring.springmvcdemo.HomeController.getUsers())")
//    public void logAfter(){
//
//        LOGGER.info("getUsers() Method Called");
//    }

    @AfterReturning("execution(public * com.dev43.spring.springmvcdemo.HomeController.getUsers())")
    public void logAfterReturning(){

        LOGGER.info("getUsers() Method Called");
    }

    @AfterThrowing("execution(public * com.dev43.spring.springmvcdemo.HomeController.getUsers())")
    public void logException(){

        LOGGER.info("Error");
    }
}
