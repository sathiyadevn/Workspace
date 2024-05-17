package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo repo;

    @GetMapping( "users")
    public List<User> getUsers(){
        List<User> users = repo.findAll();
    return users;
    }

    @GetMapping("users/{userId}")
    public User getUser(@PathVariable("userId") int id){
        User user=repo.findById(id).orElse(new User(0,""));
        return user;
    }
    @PostMapping(path="user",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public User addUser(@RequestBody User user){
        repo.save(user);
        return user;
    }
}
