package com.dev43.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");

        User user= (User) factory.getBean("user");
        System.out.println(user.getAge());

        user.code();


    }
}
