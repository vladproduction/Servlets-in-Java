package com.vladproduction.servlets;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vladproduction.dao.ArtistDao;
import com.vladproduction.data.Artist;
import com.vladproduction.data.ArtistBean;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.sql.DataSource;

@WebServlet(name = "mainServlet", value = {"/main", "/artists", "/add_artist"})
public class MainServlet extends HttpServlet {

    @Resource(name = "jdbc/chinook")
    DataSource dataSource;

    private ArtistDao artistDao;

    public void init() {
        artistDao = new ArtistDao(dataSource);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArtistBean ab = new ArtistBean(artistDao.findAllArtists());
        request.setAttribute("ab", ab);
        request.getRequestDispatcher("/artists.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getRequestURI().endsWith("/add_artist");
        addArtist(request, response);
    }

    private void addArtist(HttpServletRequest request, HttpServletResponse response) throws IOException {
        artistDao.add(new Artist(0, request.getParameter("artist")));
        response.sendRedirect("artists");
    }

    public void destroy() {
    }
}