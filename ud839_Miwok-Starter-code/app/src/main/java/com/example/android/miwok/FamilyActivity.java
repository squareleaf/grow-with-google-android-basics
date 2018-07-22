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
        members.add(new Word("father", "әpә", R.drawable.family_father));
        members.add(new Word("mother", "әṭa", R.drawable.family_mother));
        members.add(new Word("son", "angsi", R.drawable.family_son));
        members.add(new Word("daughter", "tune", R.drawable.family_daughter));
        members.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        members.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        members.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        members.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        members.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        members.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        WordAdapter familyAdapter = new WordAdapter(this, members, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(familyAdapter);
    }
}
