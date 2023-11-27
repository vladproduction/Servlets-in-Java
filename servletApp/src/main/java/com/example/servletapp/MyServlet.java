package com.example.servletapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "myServlet", urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("service()");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String parameterName = parameterNames.nextElement();
            printWriter.println("parameterName = "+parameterName);
        }
        printWriter.flush();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyServlet.doGet()");
        String headerMyNameValue = req.getHeader("my-name");
        System.out.println("headerMyNameValue = "+headerMyNameValue);
        //http://localhost:8080/servletapp/myServlet?age=40&height=174&weight=79
        String age = req.getParameter("age");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");

        System.out.println("Parameters: "+age+"; "+height+"; "+weight);



        String textInfo = "Hello, "+headerMyNameValue+"! Your parameters: "+"age = "+age+"; " +
                "height = "+height+"; weight = "+weight;
        resp.addHeader("sample-header", textInfo);

        String contextAction = req.getParameter("contextAction");
        System.out.println(contextAction);
        resp.addHeader("sample-header2", contextAction);

        //---------

        //just for text
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("Content from SERVLET resp.getWriter()");
//        printWriter.flush();

        //photo, music, others type of data and text also
        ServletOutputStream out = resp.getOutputStream();
        out.write("Content from SERVLET resp.getOutputStream()".getBytes());



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            System.out.println("MyServlet.doPost()");
            String headerMyNameValue = req.getHeader("my-name");
            System.out.println("headerMyNameValue = "+headerMyNameValue);
            String age = req.getParameter("age");
            String height = req.getParameter("height");
            String weight = req.getParameter("weight");

            System.out.println("Parameters: "+age+"; "+height+"; "+weight);

            //---------------------
            System.out.println("-------get request Body-------START---");
            BufferedReader br = req.getReader();
            String line = null;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("-------get request Body-------END---");

            String textInfo = "Hello, "+headerMyNameValue+"! Your parameters: "+"age = "+age+"; " +
                    "height = "+height+"; weight = "+weight;
            resp.addHeader("sample-header", textInfo);

            String contextAction = req.getParameter("contextAction");
            System.out.println(contextAction);
            resp.addHeader("sample-header2", contextAction);
            ServletOutputStream out = resp.getOutputStream();
            out.write("Content from SERVLET resp.getOutputStream()  doPost()".getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            System.out.println("MyServlet.doPut()");
            String headerMyNameValue = req.getHeader("my-name");
            System.out.println("headerMyNameValue = "+headerMyNameValue);
            String age = req.getParameter("age");
            String height = req.getParameter("height");
            String weight = req.getParameter("weight");

            System.out.println("Parameters: "+age+"; "+height+"; "+weight);

            //---------------------
            System.out.println("-------get request Body-------START---");
            BufferedReader br = req.getReader();
            String line = null;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("-------get request Body-------END---");

            String textInfo = "Hello, "+headerMyNameValue+"! Your parameters: "+"age = "+age+"; " +
                    "height = "+height+"; weight = "+weight;
            resp.addHeader("sample-header", textInfo);

            String contextAction = req.getParameter("contextAction");
            System.out.println(contextAction);
            resp.addHeader("sample-header2", contextAction);
            ServletOutputStream out = resp.getOutputStream();
            out.write("Content from SERVLET resp.getOutputStream()  doPut()".getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            System.out.println("MyServlet.doDelete()");
            String headerMyNameValue = req.getHeader("my-name");
            System.out.println("headerMyNameValue = "+headerMyNameValue);
            String age = req.getParameter("age");
            String height = req.getParameter("height");
            String weight = req.getParameter("weight");

            System.out.println("Parameters: "+age+"; "+height+"; "+weight);

            //---------------------
            System.out.println("-------get request Body-------START---");
            BufferedReader br = req.getReader();
            String line = null;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("-------get request Body-------END---");

            String textInfo = "Hello, "+headerMyNameValue+"! Your parameters: "+"age = "+age+"; " +
                    "height = "+height+"; weight = "+weight;
            resp.addHeader("sample-header", textInfo);

            String contextAction = req.getParameter("contextAction");
            System.out.println(contextAction);
            resp.addHeader("sample-header2", contextAction);
            ServletOutputStream out = resp.getOutputStream();
            out.write("Content from SERVLET resp.getOutputStream()  dodoDelete()".getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
