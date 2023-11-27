package com.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/vlad")
public class HelloServlet extends HttpServlet {
    static {
        System.out.println("static block");
    }

     {
        System.out.println("init block");
    }

    public HelloServlet() {
        System.out.println("constructor");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello World from Servlet! "+hashCode());
    }
}
