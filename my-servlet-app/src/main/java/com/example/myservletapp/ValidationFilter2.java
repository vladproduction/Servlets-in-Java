package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

public class ValidationFilter2 implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        String ageParam = request.getParameter("age");
        try{
            Integer.parseInt(ageParam);
            chain.doFilter(request, response);
            PrintWriter pw = response.getWriter();
            pw.println("Back from Filter2 response");
            pw.flush();
        }catch (NumberFormatException ex){
            PrintWriter pw = response.getWriter();
            pw.println("Filter2 response: Parameter age is not a number");
            pw.flush();
        }

    }

    public void destroy() {
    }
}
