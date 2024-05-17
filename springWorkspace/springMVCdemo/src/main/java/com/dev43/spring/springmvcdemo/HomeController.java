package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    UserRepo repo;

    @ModelAttribute
    public void modelData(Model m) {
        m.addAttribute("name", "Developer");
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("getUsers")
    public String getUsers(Model m){

        m.addAttribute("getUsers",repo.findAll());
        return "showUsers";
    }

    @GetMapping("getUser")
    public String getUser(@RequestParam int id, Model m){

        m.addAttribute("getUser",repo.getOne(id));
        return "showUsers";
    }
    @GetMapping("getUserByName")
    public String getUserByName(@RequestParam String name, Model m){

        m.addAttribute("getUser",repo.find(name));
        return "showUsers";
    }

    @PostMapping("addUser")
    public String addUser(@ModelAttribute("addUser") User user) {
        repo.save(user);
        return "result";
    }


}
