package com.example.tiffany.montypythonquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        boolean worthy = true;

        EditText nameInput = (EditText) findViewById(R.id.knight_name_answer);
        String knightName = nameInput.getText().toString();

        // knights must have a name
        if (TextUtils.isEmpty(knightName)) {
            worthy = false;
        }

        EditText questInput = (EditText) findViewById(R.id.knight_quest_answer);
        String quest = questInput.getText().toString();

        // knights must seek the grail
        if (quest.toLowerCase().indexOf(("grail").toLowerCase()) == -1) {
            worthy = false;
        }

        CheckBox yellowCheckBox = (CheckBox) findViewById(R.id.knight_color_yellow);
        boolean yellow = yellowCheckBox.isChecked();

        CheckBox greenCheckBox = (CheckBox) findViewById(R.id.knight_color_green);
        boolean green = greenCheckBox.isChecked();

        CheckBox blueCheckBox = (CheckBox) findViewById(R.id.knight_color_blue);
        boolean blue = blueCheckBox.isChecked();

        // knights can only have one favorite color
        if (yellow && (green || blue) || (green && blue)) {
            worthy = false;
        }

        RadioGroup rGroup = (RadioGroup) findViewById(R.id.swallow_group);
        String swallow = ((RadioButton)findViewById(rGroup.getCheckedRadioButtonId())).getText().toString();
        String badAnswer = this.getResources().getString(R.string.swallow_unknown);

        // knights must know many things to be a knight
        if (swallow == badAnswer) {
            worthy = false;
        }

        if (worthy == true) {
            Toast.makeText(this, "You may cross the bridge, Sir Knight", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong! Into the pit with you! AAAAAGHHHH!", Toast.LENGTH_SHORT).show();
        }
    }
}
