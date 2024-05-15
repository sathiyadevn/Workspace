package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute
    public void modelData(Model m){
        m.addAttribute("name","Developer");
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2")int j, Model m){

        int z=i+j;
        m.addAttribute("addValue",z);
        return "result";
    }

    @PostMapping("addUser")
    public String addUser(@ModelAttribute("addUser") User user){
//        User user=new User();
//        user.setId(id);
//        user.setName(name);

//        m.addAttribute("addUser",user);
        return "result";
    }



}
