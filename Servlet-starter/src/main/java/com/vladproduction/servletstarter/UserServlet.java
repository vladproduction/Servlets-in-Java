package com.vladproduction.servletstarter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "userServlet", value = {"/user-servlet"})
public class UserServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String user = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("userage"));
        UserBean userBean = new UserBean(user, age);
        request.setAttribute("userBeanFirstParam", userBean);
        request.getRequestDispatcher("/user.jsp").forward(request, response);


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request, response);
    }


    public void destroy() {
    }

    //http://localhost:8080/Servlet_starter_war_exploded/user-servlet
    //http://localhost:8080/Servlet_starter_war_exploded/user-servlet?username=user&userage=23
}