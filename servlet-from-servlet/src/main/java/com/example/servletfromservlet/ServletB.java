package com.example.servletfromservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ServletB", value = "/ServletB")
public class ServletB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ServletB---Start");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("\tServletB---Start(response)");

        printWriter.println("\tServletB---End(response)");
        System.out.println("ServletB---End");

    }
}
