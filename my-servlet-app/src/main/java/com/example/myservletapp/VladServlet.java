package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "vladServlet", value = "/vladServlet")
public class VladServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("VladServlet.doGet");
        PrintWriter pw = response.getWriter();
        pw.println("ok from VladServlet.doGet; Servlet END");
        pw.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("VladServlet.doPost");
        PrintWriter pw = response.getWriter();
        pw.println("ok from VladServlet.doPost; Servlet END");
        pw.flush();
    }
}
