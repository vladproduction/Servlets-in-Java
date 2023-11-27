package sample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "VladServlet", value = "/VladServlet")
public class VladServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Vlad Servlet - start");
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/ServletA");
        requestDispatcher.include(request, response);
        pw.println("Vlad Servlet - finish");
    }
}
