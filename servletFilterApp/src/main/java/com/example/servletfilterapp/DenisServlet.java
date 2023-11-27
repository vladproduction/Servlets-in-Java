package com.example.servletfilterapp;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "denisServlet", value = "/denisServlet")
public class DenisServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DenisServlet.doGet()");
        PrintWriter pw = resp.getWriter();
        pw.println("ok from DenisServlet.doGet(); servlet END");
        pw.flush();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DenisServlet.doPost()");
        PrintWriter pw = resp.getWriter();
        pw.println("ok from DenisServlet.doPost()");
        pw.flush();


    }
}
