package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

public class ValidationFilter1 implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        if(request.getParameter("age")==null){
            PrintWriter pw = response.getWriter();
            pw.println("Filter1 response: Parameter age not found!!!");
            pw.flush();
        } else {
            chain.doFilter(request, response);
            PrintWriter pw = response.getWriter();
            pw.println("Back from Filter1 response");
            pw.flush();
        }
    }

    public void destroy() {
    }
}
