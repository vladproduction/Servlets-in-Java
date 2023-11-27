package com.example.servletfilterapp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;


@WebFilter(filterName = "validationFilter1", urlPatterns = {"/dataValidationServlet"})
public class ValidationFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        if(req.getParameter("age")==null){
            PrintWriter pw = resp.getWriter();
            pw.println("Filter resp: Parameter age not found!!!");
            pw.flush();
        }else {
            chain.doFilter(req, resp);
            PrintWriter pw = resp.getWriter();
            pw.println("Back from Filter resp");
            pw.flush();
        }
    }

    @Override
    public void destroy() {

    }
}
