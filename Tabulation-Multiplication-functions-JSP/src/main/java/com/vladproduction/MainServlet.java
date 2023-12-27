package com.vladproduction;

import java.io.*;

import com.vladproduction.multiplication.MultiplicationBean;
import com.vladproduction.tabulation.TabulationBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "mainServlet", value = {"/main", "/main2"})
public class MainServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getRequestURI().endsWith("/main")) {
            processTabulation(request, response);
        } else processMultiplication(request, response);
    }

    private void processTabulation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double startParam = Double.parseDouble(request.getParameter("startParam"));
        double finishParam = Double.parseDouble(request.getParameter("finishParam"));
        double stepParam = Double.parseDouble(request.getParameter("stepParam"));

        TabulationBean tabulationBean = new TabulationBean(startParam, finishParam, stepParam);
        request.setAttribute("tb", tabulationBean);
        request.getRequestDispatcher("/tabulationResult.jsp").forward(request, response);
    }

    private void processMultiplication(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));

        MultiplicationBean multiplicationBean = new MultiplicationBean(number1, number2);
        request.setAttribute("mb", multiplicationBean);
        request.getRequestDispatcher("/multiplicationResult.jsp").forward(request, response);
    }

    public void destroy() {
    }
}