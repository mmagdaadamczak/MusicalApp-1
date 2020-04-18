package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Artist Name 1", "Song Titel 1", R.drawable.ic_001_robot));
        songs.add(new Song("Artist Name 2", "Song Titel 2", R.drawable.ic_002_android));
        songs.add(new Song("Artist Name 3", "Song Titel 3", R.drawable.ic_003_logo));
        songs.add(new Song("Artist Name 4", "Song Titel 4", R.drawable.ic_004_robot_1));
        songs.add(new Song("Artist Name 5", "Song Titel 5", R.drawable.ic_005_robot_2));


        // Create a songAdapter and set this adapter on a listview
        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView list = findViewById(R.id.main_Activity);
        list.setAdapter(songAdapter);

    }

}
