package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletC", value = "/ServletC")
public class ServletC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.sendRedirect("MyDispatcherServlet?name=Vlad");
        //response.sendRedirect("http://google.com");
    }


}
