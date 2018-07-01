package com.example.tiffany.runningmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView slowestButton = (TextView) findViewById(R.id.slowestButton);
        TextView slowButton = (TextView) findViewById(R.id.slowButton);
        TextView fastButton = (TextView) findViewById(R.id.fastButton);
        TextView fastestButton = (TextView) findViewById(R.id.fastestButton);

        slowestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, SlowestActivity.class);
                startActivity(playingIntent);
            }
        });

        slowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, SlowActivity.class);
                startActivity(playingIntent);
            }
        });

        fastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, FastActivity.class);
                startActivity(playingIntent);
            }
        });

        fastestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, FastestActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
