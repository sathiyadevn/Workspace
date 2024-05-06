package com.dev43.filterservlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

@WebFilter("/addUser")
public class FilterDemo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PrintWriter out=response.getWriter();

        HttpServletRequest req= (HttpServletRequest) request;
        int id=Integer.parseInt(request.getParameter("id"));

        if(id>1)
            chain.doFilter(request,response);
        else
            out.println("Invalid input");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
