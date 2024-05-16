package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo repo;

    @GetMapping("users")
    public List<User> getUsers(Model m){
        List<User> users = repo.findAll();
    return users;
    }

    @GetMapping("users/{userId}")
    public User getUser(@PathVariable("userId") int id){
        User user=repo.findById(id).orElse(new User(0,""));
        return user;
    }
}
