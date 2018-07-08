package com.example.tiffany.runningmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SlowestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ArrayList<Song> slowestSongs = new ArrayList<Song>();
        slowestSongs.add(new Song("The Anchor", "Bastille", "132"));
        slowestSongs.add(new Song("Who Am I", "Vance Joy", "128"));
        slowestSongs.add(new Song("Now That We're Dead", "Metallica", "128"));
        slowestSongs.add(new Song("Locked Out of Heaven", "Bruno Mars", "128"));
        slowestSongs.add(new Song("Work It Out", "Lil Jon & Pitbull", "128"));
        slowestSongs.add(new Song("Fire Woman", "The Cult", "132"));
        slowestSongs.add(new Song("The Time", "The Black Eyed Peas", "128"));
        slowestSongs.add(new Song("Get the Party Started", "P!nk", "129"));
        slowestSongs.add(new Song("Push It", "Salt-N-Pepa", "128"));
        slowestSongs.add(new Song("Club Can't Handle Me", "Flo Rida", "128"));

        SongAdapter songsAdapter = new SongAdapter(this, slowestSongs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);

        ImageButton slowestButton = (ImageButton) findViewById(R.id.walkButton);
        ImageButton slowButton = (ImageButton) findViewById(R.id.jogButton);
        ImageButton fastButton = (ImageButton) findViewById(R.id.runButton);
        ImageButton fastestButton = (ImageButton) findViewById(R.id.sprintButton);

        slowestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent walkIntent = new Intent(SlowestActivity.this, SlowestActivity.class);
                startActivity(walkIntent);
            }
        });

        slowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jogIntent = new Intent(SlowestActivity.this, SlowActivity.class);
                startActivity(jogIntent);
            }
        });

        fastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent runIntent = new Intent(SlowestActivity.this, FastActivity.class);
                startActivity(runIntent);
            }
        });

        fastestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sprintIntent = new Intent(SlowestActivity.this, FastestActivity.class);
                startActivity(sprintIntent);
            }
        });
    }
}
