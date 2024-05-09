package com.dev43.userdetails;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/getUser")
public class UserController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int uid = Integer.parseInt(request.getParameter("uid"));

        UserDao dao = new UserDao();
        User user = dao.getUser(uid);

//        request.setAttribute("userObj",user );
//        RequestDispatcher rd = request.getRequestDispatcher("showUser.jsp");
//        rd.forward(request, response);

        HttpSession session=request.getSession();
        session.setAttribute("userObj",user );

        response.sendRedirect("showUser.jsp");


    }
}
