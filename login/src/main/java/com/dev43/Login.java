package com.dev43;

import com.dev43.dao.LoginDao;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("uname");
        String pass=request.getParameter("pass");

        LoginDao dao=new LoginDao();

        try {
            if(dao.check(name,pass)) {

                HttpSession session=request.getSession();       // without session, we can access welcomePage.jsp page if we knew the page name
                session.setAttribute("userName",name);      // by session,we cant access other pages without login cant use this links on other browsers as well
                response.sendRedirect("welcomePage.jsp");
            }
            else
                response.sendRedirect("loginPage.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
