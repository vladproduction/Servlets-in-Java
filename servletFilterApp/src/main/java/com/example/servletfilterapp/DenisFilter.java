package com.example.servletfilterapp;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "denisFilter", urlPatterns = {"/denisServlet" , "/vladServlet"})
public class DenisFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("DenisFilter.doFilter()---START");
        chain.doFilter(request, response);
        PrintWriter pw = response.getWriter();
        pw.println("after Filter; filter END!");
        pw.flush();

        System.out.println("DenisFilter.doFilter()---END");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
