package com.example.myservletapp;

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

    /*@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("service()");

        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String parameterName = parameterNames.nextElement();
            pw.println("parameterName="+parameterName);
        }


        pw.flush();

    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println("MyServlet.doGet");
            String headerValue = req.getHeader("my-name");
            System.out.println("headerValue=" + headerValue);
            String phone = req.getParameter("phone");
            String computer = req.getParameter("computer");
            String computer2 = req.getParameter("computer2");
            System.out.println("phone=" + phone);
            System.out.println("computer=" + computer);
            System.out.println("computer2=" + computer2);

            String text = "Hello, " + headerValue + "; you have comp=" + computer + "; you have phone=" + phone;
            resp.addHeader("sample-header", text);

            PrintWriter pw = resp.getWriter();
            pw.println("This text for body from servlet!!!!");
            pw.flush();

            //ServletOutputStream out = resp.getOutputStream();
            //out.write("teststststs".getBytes());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println("MyServlet.doPut");
            String headerValue = req.getHeader("my-name");
            System.out.println("headerValue=" + headerValue);
            String phone = req.getParameter("phone");
            String computer = req.getParameter("computer");
            String computer2 = req.getParameter("computer2");
            System.out.println("phone=" + phone);
            System.out.println("computer=" + computer);
            System.out.println("computer2=" + computer2);
            System.out.println("---------Get request Body-----------START");
            BufferedReader bufferedReader = req.getReader();
            String line = null;
            while(  (line = bufferedReader.readLine())!=null   ){
                System.out.println(line);
            }
            System.out.println("---------Get request Body-----------END");

            String text = "Hello, " + headerValue + "; you have comp=" + computer + "; you have phone=" + phone;
            resp.addHeader("sample-header", text);

            //PrintWriter pw = resp.getWriter();
            //pw.println("This text for body from servlet!!!!");
            //pw.flush();

            ServletOutputStream out = resp.getOutputStream();
            out.write("This is response from POST".getBytes());
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println("MyServlet.doPost");
            String headerValue = req.getHeader("my-name");
            System.out.println("headerValue=" + headerValue);
            String phone = req.getParameter("phone");
            String computer = req.getParameter("computer");
            String computer2 = req.getParameter("computer2");
            System.out.println("phone=" + phone);
            System.out.println("computer=" + computer);
            System.out.println("computer2=" + computer2);
            System.out.println("---------Get request Body-----------START");
            BufferedReader bufferedReader = req.getReader();
            String line = null;
            while(  (line = bufferedReader.readLine())!=null   ){
                System.out.println(line);
            }
            System.out.println("---------Get request Body-----------END");

            String text = "Hello, " + headerValue + "; you have comp=" + computer + "; you have phone=" + phone;
            resp.addHeader("sample-header", text);

            //PrintWriter pw = resp.getWriter();
            //pw.println("This text for body from servlet!!!!");
            //pw.flush();

            ServletOutputStream out = resp.getOutputStream();
            out.write("This is response from PUT".getBytes());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println("MyServlet.doDelete");
            String headerValue = req.getHeader("my-name");
            System.out.println("headerValue=" + headerValue);
            String phone = req.getParameter("phone");
            String computer = req.getParameter("computer");
            String computer2 = req.getParameter("computer2");
            System.out.println("phone=" + phone);
            System.out.println("computer=" + computer);
            System.out.println("computer2=" + computer2);
            System.out.println("---------Get request Body-----------START");
            BufferedReader bufferedReader = req.getReader();
            String line = null;
            while(  (line = bufferedReader.readLine())!=null   ){
                System.out.println(line);
            }
            System.out.println("---------Get request Body-----------END");

            String text = "Hello, " + headerValue + "; you have comp=" + computer + "; you have phone=" + phone;
            resp.addHeader("sample-header", text);

            //PrintWriter pw = resp.getWriter();
            //pw.println("This text for body from servlet!!!!");
            //pw.flush();

            ServletOutputStream out = resp.getOutputStream();
            out.write("This is response from DELETE".getBytes());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
