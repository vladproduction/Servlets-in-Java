package com.example.requestdispatcherdemo;

import java.io.*;

import com.example.requestdispatcherdemo.beans.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "myServlet", value = "/start")
public class MyServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String userName = request.getParameter("userName");
        int userAge = Integer.parseInt(request.getParameter("userAge"));
        User user = new User(userName, userAge);
        request.setAttribute("user", user);

        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void destroy() {
    }
}

/*
http://localhost:8080/requestDispatcherDemo/start?userName=Qwerty&userAge=25 (doGet)
http://localhost:8080/requestDispatcherDemo/start(doPost)
 */