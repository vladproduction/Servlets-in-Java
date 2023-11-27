package com.example.webservlets1008;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "page", value = "/page")
public class PageServlet extends HttpServlet {
    private String message;
    private Date date;

    public void init() {
        message = "Hello Page";
        date = new Date();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + date.getTime() + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
