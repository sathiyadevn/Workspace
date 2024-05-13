package com.dev43.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
        User user= (User) factory.getBean("user");
        user.code();
    }
}
