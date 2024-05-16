package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserRepo repo;

    @GetMapping("users")
    @ResponseBody
    public List<User> getUsers(Model m){
        List<User> users = repo.findAll();
    return users;
    }
}
