package com.example.tiffany.runningmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNowPlaying(View view) {
        Intent playingIntent = new Intent(this, NowPlaying.class);
        startActivity(playingIntent);
    }
}
