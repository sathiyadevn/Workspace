package com.dev43.filterservlet;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/addUser")
public class ServletDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();

        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");

        out.println("hai "+name);
    }
}