package com.example.tiffany.runningmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ArrayList<Song> fastSongs = new ArrayList<Song>();
        fastSongs.add(new Song("What Goes Around", "Justin Timberlake", "152"));
        fastSongs.add(new Song("Bang Bang", "Jessie J, Ariana Grande & Nicki Minaj", "150"));
        fastSongs.add(new Song("Run-Around", "Blues Traveler", "151"));
        fastSongs.add(new Song("Mr. Brightside", "The Killers", "148"));
        fastSongs.add(new Song("The Great Escape", "Boys Like Girls", "150"));
        fastSongs.add(new Song("Pink Lemonade", "James Bay", "152"));
        fastSongs.add(new Song("A Letter to Elise", "The Cure", "150"));
        fastSongs.add(new Song("Dogs Days Are Over", "Florence + The Machine", "150"));
        fastSongs.add(new Song("Animal", "Neon Trees", "148"));
        fastSongs.add(new Song("I'm Yours", "Jason Mraz", "151"));

        SongAdapter songsAdapter = new SongAdapter(this, fastSongs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);

        ImageButton slowestButton = (ImageButton) findViewById(R.id.walkButton);
        ImageButton slowButton = (ImageButton) findViewById(R.id.jogButton);
        ImageButton fastButton = (ImageButton) findViewById(R.id.runButton);
        ImageButton fastestButton = (ImageButton) findViewById(R.id.sprintButton);

        slowestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slowestIntent = new Intent(FastActivity.this, SlowestActivity.class);
                startActivity(slowestIntent);
            }
        });

        slowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slowIntent = new Intent(FastActivity.this, SlowActivity.class);
                startActivity(slowIntent);
            }
        });

        fastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fastIntent = new Intent(FastActivity.this, FastActivity.class);
                startActivity(fastIntent);
            }
        });

        fastestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fastestIntent = new Intent(FastActivity.this, FastestActivity.class);
                startActivity(fastestIntent);
            }
        });
    }
}
