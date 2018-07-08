package com.example.tiffany.runningmusicapp;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.ListView;
        import android.widget.TextView;

        import java.util.ArrayList;

public class SlowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ArrayList<Song> slowSongs = new ArrayList<Song>();
        slowSongs.add(new Song("Womanizer", "Britney Spears", "139"));
        slowSongs.add(new Song("Viva la Vida", "Coldplay", "138"));
        slowSongs.add(new Song("Little Lion Man", "Mumford & Sons", "139"));
        slowSongs.add(new Song("Somebody Told Me", "The Killers", "138"));
        slowSongs.add(new Song("Feel Good Inc", "Gorillaz", "139"));
        slowSongs.add(new Song("Accidentally In Love", "Counting Crows", "138"));
        slowSongs.add(new Song("The Cave", "Mumford & Sons", "142"));
        slowSongs.add(new Song("Who Knew", "P!nk", "140"));
        slowSongs.add(new Song("Call Me", "Blondie", "142"));
        slowSongs.add(new Song("Applause", "Lady Gaga", "140"));

        SongAdapter songsAdapter = new SongAdapter(this, slowSongs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);

        ImageButton slowestButton = (ImageButton) findViewById(R.id.walkButton);
        ImageButton slowButton = (ImageButton) findViewById(R.id.jogButton);
        ImageButton fastButton = (ImageButton) findViewById(R.id.runButton);
        ImageButton fastestButton = (ImageButton) findViewById(R.id.sprintButton);

        slowestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slowestIntent = new Intent(SlowActivity.this, SlowestActivity.class);
                startActivity(slowestIntent);
            }
        });

        slowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slowIntent = new Intent(SlowActivity.this, SlowActivity.class);
                startActivity(slowIntent);
            }
        });

        fastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fastIntent = new Intent(SlowActivity.this, FastActivity.class);
                startActivity(fastIntent);
            }
        });

        fastestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fastestIntent = new Intent(SlowActivity.this, FastestActivity.class);
                startActivity(fastestIntent);
            }
        });
    }
}
