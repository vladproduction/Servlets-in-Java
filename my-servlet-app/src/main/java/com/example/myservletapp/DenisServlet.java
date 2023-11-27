package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "denisServlet", value = "/denisServlet")
public class DenisServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DenisServlet.doGet");
        PrintWriter pw = response.getWriter();
        pw.println("ok from DenisServlet.doGet; Servlet END");
        pw.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DenisServlet.doPost");
        PrintWriter pw = response.getWriter();
        pw.println("ok from DenisServlet.doPost");
        pw.flush();
    }
}
