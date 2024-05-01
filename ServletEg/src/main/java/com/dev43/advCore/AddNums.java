package com.dev43.advCore;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addNums")
public class AddNums extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int x = i + j;
//		System.out.println(x);

//		PrintWriter out = res.getWriter();
//		out.println("Addition :" + x);

        // Servlet to Servlet
        // 1) RequestDispatcher
//		req.setAttribute("x", x);
//
//		RequestDispatcher rs=req.getRequestDispatcher("square");
//		rs.forward(req,res);

        // 2) sendRedirect
//		res.sendRedirect("square?x="+x);		// 1. URL writing

        // 2. Session
//		HttpSession session=req.getSession();
//		session.setAttribute("xValue", x);

        // 3. Cookie
        Cookie cookie = new Cookie("xValue", x + "");
        res.addCookie(cookie);

        res.sendRedirect("square");

    }

}

