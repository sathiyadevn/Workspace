package com.dev43.advCore;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class Square extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        // 1)
//		int x = (int) req.getAttribute("x");

        // 2) 1.
//		System.out.println("Square send");
//		int x =Integer.parseInt(req.getParameter("x"));

        // 2.
//		HttpSession session = req.getSession();
//		int x = (int) session.getAttribute("xValue");
//		session.removeAttribute("xValue");

        // 3.
        Cookie cookies[]=req.getCookies();		// No getCookie(), use getCookies()
        int x=0;
        for(Cookie c:cookies) {
            if(c.getName().equals("xValue")) {
                x=Integer.parseInt(c.getValue());
            }
        }

        x = x * x;
        PrintWriter out = res.getWriter();
        out.println("Square of Addition : " + x);

    }
}
