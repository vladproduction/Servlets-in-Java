package listener;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CityServlet", value = "/CityServlet")
public class CityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object value = request.getServletContext().getAttribute("city");
        response.getWriter().println("city="+value);
        if("Kyiv".equals(value)){
            request.getServletContext().setAttribute("country", "Ukraine");
        }
        OldSingleton.getInstance().makeAction();
        Object myValue = request.getServletContext().getAttribute("mySingle");
        MySingleton mySingle = (MySingleton) myValue;
        mySingle.makeAction();

    }
}
