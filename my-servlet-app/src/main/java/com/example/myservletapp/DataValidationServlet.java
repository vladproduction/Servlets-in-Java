package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "dataValidationServlet", value = "/dataValidationServlet")
public class DataValidationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*if(request.getParameter("age")==null){
            PrintWriter pw = response.getWriter();
            pw.println("Parameter age not found!!!");
            pw.flush();
            return;
        }*/

        int age = Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");
        StringBuilder text = new StringBuilder();
        text.append("DataValidationServlet.doGet; ");
        text.append("age="+age+"; ");
        text.append("name="+name+"; ");

        System.out.println(text);
        PrintWriter pw = response.getWriter();
        pw.println(text.toString());
        pw.flush();

    }


}

