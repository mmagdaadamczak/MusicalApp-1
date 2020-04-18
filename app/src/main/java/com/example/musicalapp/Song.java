package com.example.musicalapp;


public class Song {

    //Artist name of a default song
    private String artistName;

    //Titel of a default song
    private String songName;

    //Image Id of a default song
    private int imageResourceId;


    /**
     * Create a new Song object.
     *
     * @param artistName      is the Artist name of a default song
     * @param songName        is the Titel of a default song
     * @param imageResourceId is an Id of a default image
     */

    public Song(String artistName, String songName, int imageResourceId) {
        this.artistName = artistName;
        this.songName = songName;
        this.imageResourceId = imageResourceId;

    }


    //Get the name of the default song

    public String getSongName() {
        return songName;
    }


    // Get the name of the artist of the default song

    public String getArtistName() {
        return artistName;
    }

    // Get the id of a default image

    public int getImageResourceId() {
        return imageResourceId;
    }


}
