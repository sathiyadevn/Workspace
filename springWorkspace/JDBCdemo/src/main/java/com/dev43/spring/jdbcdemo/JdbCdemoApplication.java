package com.dev43.spring.jdbcdemo;

import com.dev43.spring.jdbcdemo.model.User;
import com.dev43.spring.jdbcdemo.repo.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbCdemoApplication {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(JdbCdemoApplication.class, args);

        User user=context.getBean(User.class);
        user.setId(1);
        user.setName("Dev43");
        user.setTech("Java");

        UserRepo repo=context.getBean(UserRepo.class);
        repo.save(user);

        System.out.println(repo.findAll());

    }

}
