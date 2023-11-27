package sample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MyDispatcherServlet", value = "/MyDispatcherServlet")
public class MyDispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if("Vlad".equalsIgnoreCase(name)){

            response.getWriter().println("MyDispatcherServlet-START");

            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/VladServlet");
            dispatcher.forward(request, response);
            //dispatcher.include(request, response);

            response.getWriter().println("MyDispatcherServlet-FINISH");

        } else if("Denis".equalsIgnoreCase(name)){
            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/DenisServlet");
            dispatcher.forward(request, response);
        } else {
            response.getWriter().println("NO ACTION IS SELECTED");
        }
    }

}
