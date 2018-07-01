package com.example.tiffany.runningmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FastestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ArrayList<Song> fastestSongs = new ArrayList<Song>();
        fastestSongs.add(new Song("We Will Rock You", "Queen", 164));
        fastestSongs.add(new Song("Love the Way You Lie, Pt. II", "Rihanna & Eminem", 166));
        fastestSongs.add(new Song("Runaway Baby", "Bruno Mars", 164));
        fastestSongs.add(new Song("Wake Me Up Before You Go-Go", "Wham!", 163));
        fastestSongs.add(new Song("Try", "P!nk", 167));
        fastestSongs.add(new Song("Boulevard of Broken Dreams", "Green Day", 166));
        fastestSongs.add(new Song("Zombie", "The Cranberries", 164));
        fastestSongs.add(new Song("Rebel Yell", "Billy Idol", 166));
        fastestSongs.add(new Song("Sing for the Moment", "Eminem", 164));
        fastestSongs.add(new Song("Lonely Boy", "The Black Keys", 166));

        SongAdapter songsAdapter = new SongAdapter(this, fastestSongs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
