package com.vladproduction.demoservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bytes")
public class ByteCounterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получить строку из запроса
        String input = request.getParameter("input");

        // Подсчитать количество байт
        int byteCount = input.getBytes().length;

        // Отправить ответ
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Количество байт: " + byteCount);
    }
}
