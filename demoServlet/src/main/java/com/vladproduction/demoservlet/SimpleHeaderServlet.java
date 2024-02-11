package com.vladproduction.demoservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/headers")
public class SimpleHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получить все заголовки запроса
        Enumeration<String> headerNames = request.getHeaderNames();

        // Вывести заголовки в ответ
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);

            out.println(headerName + ": " + headerValue);
        }
    }
}
