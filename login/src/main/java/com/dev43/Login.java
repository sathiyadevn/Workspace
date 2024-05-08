package com.dev43;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("uname");
        String pass=request.getParameter("pass");
        if(name.equals("dev43")&& pass.equals("peace")) {

            HttpSession session=request.getSession();
            session.setAttribute("userName",name);
            response.sendRedirect("welcomePage.jsp");
        }
        else
            response.sendRedirect("loginPage.jsp");
    }
}
