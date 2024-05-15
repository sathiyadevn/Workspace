package com.dev43.spring.springmvcdemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    @RequestMapping("add")
    public String add(HttpServletRequest req){
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
        int z=i+j;

        HttpSession session= req.getSession();
        session.setAttribute("addValue",z);

        return "result.jsp";
    }

}
