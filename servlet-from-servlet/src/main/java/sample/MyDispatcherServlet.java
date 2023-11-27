package sample;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MyDispatcherServlet", value = "/MyDispatcherServlet")
public class MyDispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        if("vlad".equalsIgnoreCase(name)){

            response.getWriter().println("\t\t/MyDispatcherServlet---Start");


            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/VladServlet");
            dispatcher.forward(request, response);
            //dispatcher.include(request, response);

            response.getWriter().println("\t\t/MyDispatcherServlet---Finish");

        } else if ("denis".equalsIgnoreCase(name)) {
            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/DenisServlet");
            dispatcher.forward(request, response);
            //dispatcher.include(request, response);
        }else {
            response.getWriter().println("NO ACTION SELECTED");
        }
    }
}
