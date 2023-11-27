package net.example.listener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CityServlet", value = "/CityServlet")
public class CityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object value = request.getServletContext().getAttribute("city");
        response.getWriter().println("city="+value);
        if("Kyiv".equals(value)){
            request.getServletContext().setAttribute("country", "UKRAINE");
        }
        OldSingleton.getInstance().makeAction();

        //Object myValue = request.getServletContext().getAttribute("mySingle");
        //MySingleton mySingle = (MySingleton) myValue;
        MySingleton myValue = (MySingleton) request.getServletContext().getAttribute("mySingle");
        myValue.makeAction();


    }

}
