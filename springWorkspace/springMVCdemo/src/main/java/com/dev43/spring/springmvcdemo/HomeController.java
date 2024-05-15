package com.dev43.spring.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
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

}
