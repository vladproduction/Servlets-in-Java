package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "DenisFilter", urlPatterns = {"/denisServlet", "/vladServlet"})
public class DenisFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        System.out.println("DenisFilter.doFilter()---START");
        chain.doFilter(request, response);
        PrintWriter pw = response.getWriter();
        pw.println("AFTER FILTER; FILTER; END");
        pw.flush();

        System.out.println("DenisFilter.doFilter()---END");
    }

    public void destroy() {
    }
}
