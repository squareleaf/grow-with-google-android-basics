package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> members = new ArrayList<Word>();
        members.add(new Word("father", "әpә"));
        members.add(new Word("mother", "әṭa"));
        members.add(new Word("son", "angsi"));
        members.add(new Word("daughter", "tune"));
        members.add(new Word("older brother", "taachi"));
        members.add(new Word("younger brother", "chalitti"));
        members.add(new Word("older sister", "teṭe"));
        members.add(new Word("younger sister", "kolliti"));
        members.add(new Word("grandmother", "ama"));
        members.add(new Word("grandfather", "paapa"));

        WordAdapter familyAdapter = new WordAdapter(this, members);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(familyAdapter);
    }
}
