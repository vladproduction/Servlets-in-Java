package com.example.servletfilterapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "dataValidationServlet", value = "/dataValidationServlet")
public class DataValidationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if(req.getParameter("age")==null){
//            PrintWriter pw = resp.getWriter();
//            pw.println("Parameter age not found!!!");
//            pw.flush();
//            return;
//        }

        int age = Integer.parseInt(req.getParameter("age"));
        String name = req.getParameter("name");
        StringBuilder sb = new StringBuilder();
        sb.append("dataValidationServlet.doGet() ");
        sb.append("age = "+age+"; ");
        sb.append("name = "+name+"; ");
        System.out.println(sb);

        PrintWriter pw = resp.getWriter();
        pw.println(sb);
        pw.flush();
    }
}
