package net.example.listener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebListener
public class MyListener implements ServletContextListener {

    public MyListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("city", "Kyiv");
        //servletContext.setAttribute("mySingle", new MySingleton());
        MySingleton mySingleton = new MySingleton();
        servletContext.setAttribute("mySingle", mySingleton);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
    }
}
