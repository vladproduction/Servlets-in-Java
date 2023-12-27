package com.vladproduction.data;

import java.util.List;

public class ArtistBean {

    private List<Artist> artists;

    public ArtistBean(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
