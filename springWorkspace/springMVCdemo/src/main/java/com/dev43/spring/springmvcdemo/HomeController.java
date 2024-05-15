package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @ModelAttribute
    public void modelData(Model m) {
        m.addAttribute("name", "Developer");
    }

    @RequestMapping("/")
    public String home() {

        return "index";
    }
    @GetMapping("getUsers")
    public String getUser(Model m){
        List<User> users= Arrays.asList(new User(101,"java"),new User(102,"python"));
        m.addAttribute("getUsers",users);
        return "showUsers";
    }

    @PostMapping("addUser")
    public String addUser(@ModelAttribute("addUser") User user) {

        return "result";
    }


}
