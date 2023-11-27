package com.example.webservlets1008;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;

@WebServlet(name = "dateServlet", value = "/date")
public class DateServlet extends HttpServlet {
    private LocalDateTime message;

    public void init() {
        message = (LocalDateTime.now());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Date
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>" + message + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}