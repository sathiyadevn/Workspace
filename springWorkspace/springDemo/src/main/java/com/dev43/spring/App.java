package com.dev43.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
//        User user= (User) factory.getBean("user");
//        user.code();
//        user.age=20;
//        System.out.println(user.age);       // 20
//
//        // Singleton -> Spring Container gives you the same obj for all .getbean() call
//        User user1= (User) factory.getBean("user");
//        System.out.println(user1.age);      // 20  -> 0
//
//        // Prototype
//        User user2= (User) factory.getBean("user");
//        System.out.println(user2.age);     // 0
    }
}
