package com.example.servletfilterapp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;


@WebFilter(filterName = "validationFilter2", urlPatterns = {"/dataValidationServlet"})
public class ValidationFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        String ageParam = req.getParameter("age");
        try{
            Integer.parseInt(ageParam);
            chain.doFilter(req, resp);
            PrintWriter pw = resp.getWriter();
            pw.println("Back from Filter2 resp");
            pw.flush();
        }catch (NumberFormatException e){
            PrintWriter pw = resp.getWriter();
            pw.println("Filter2 resp: Parameter age not number!!!");
            pw.flush();
        }
    }

    @Override
    public void destroy() {

    }
}
