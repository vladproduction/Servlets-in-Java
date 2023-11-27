package sample;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "VladServlet", value = "/VladServlet")
public class VladServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();
        printWriter.println("/VladServlet---start");

        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/ServletA");
        dispatcher.include(request, response);

        printWriter.println("/VladServlet---finish");
    }
}
