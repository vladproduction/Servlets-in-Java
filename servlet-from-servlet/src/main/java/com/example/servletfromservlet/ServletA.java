package com.example.servletfromservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ServletA", value = "/ServletA")
public class ServletA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ServletA---Start");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("ServletA---Start(response)");


        System.out.println("---Dispatch begin---");
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/ServletB");
        //dispatcher.forward(request, response);//redirect to another
        dispatcher.include(request, response); // work together both
        System.out.println("---Dispatch completed---");

        pause(5000);
        System.out.println("ServletA---End");
        printWriter.println("ServletA---End(response)");
        printWriter.flush();
    }

    private void  pause(long delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
