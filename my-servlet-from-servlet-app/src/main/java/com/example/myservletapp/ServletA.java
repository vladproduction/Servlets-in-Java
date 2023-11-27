package com.example.myservletapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletA", value = "/ServletA")
public class ServletA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("A---start");
        PrintWriter pw = response.getWriter();
        pw.println("A---start");

        System.out.println("-----Dispatch-begin--------");
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/ServletB");
        //dispatcher.forward(request, response);
        dispatcher.include(request, response);

        System.out.println("-----Dispatch-completed--------");
        pause(5000);

        System.out.println("A---end");
        pw.println("A---end");
        pw.flush();
    }

    private void pause(long delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
