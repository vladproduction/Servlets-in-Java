package com.vladproduction.dao;

import com.vladproduction.data.Artist;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class ArtistDao {

    private DataSource dataSource;

    public ArtistDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Artist> findAllArtists(){

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from artist")) {

            List<Artist> artists = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("ArtistId");
                String name = resultSet.getString("Name");
                artists.add(new Artist(id, name));
            }
            return artists;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(Artist artist) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement("insert into artist (Name) values (?)")
        ) {
            ps.setString(1, artist.getName());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
