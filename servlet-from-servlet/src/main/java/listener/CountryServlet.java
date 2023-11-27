package listener;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CountryServlet", value = "/CountryServlet")
public class CountryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object value = request.getServletContext().getAttribute("country");
        response.getWriter().println("country="+value);

        OldSingleton.getInstance().makeAction();

    }
}
