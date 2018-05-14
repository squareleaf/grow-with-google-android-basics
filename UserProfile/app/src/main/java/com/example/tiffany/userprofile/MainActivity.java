package com.example.tiffany.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.name);
        TextView birthday = (TextView) findViewById(R.id.birthday);
        TextView country = (TextView) findViewById(R.id.country);
        ImageView picture = (ImageView) findViewById(R.id.profile_picture);

        name.setText("Tiffany");
        birthday.setText("November 16");
        country.setText("US");
        picture.setImageResource(R.drawable.me);
    }
}
