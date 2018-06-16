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
        int worthy = 0;

        EditText nameInput = (EditText) findViewById(R.id.knight_name_answer);
        String knightName = nameInput.getText().toString();

        if ((knightName.toLowerCase().indexOf("lancelot") > -1) ||
            (knightName.toLowerCase().indexOf("robin") > -1) ||
            (knightName.toLowerCase().indexOf("bedevere") > -1) ||
            (knightName.toLowerCase().indexOf("galahad") > -1)) {
                worthy++;
        }

        // knights hail from Camelot. Round table is also acceptable
        EditText landInput = (EditText) findViewById(R.id.knight_land_answer);
        String land = landInput.getText().toString();

        if ((land.toLowerCase().indexOf("camelot") > -1) || (land.toLowerCase().indexOf("round table") > -1)) {
            worthy++;
        }

        // Tim the Enchanter is who they encounter
        CheckBox timCheckBox = (CheckBox) findViewById(R.id.magician_tim);
        boolean tim = timCheckBox.isChecked();

        if (tim) {
            worthy++;
        }

        // All of the black knight's limbs are severed
        RadioGroup rGroup = (RadioGroup) findViewById(R.id.black_knight_group);
        String blackKnight = ((RadioButton)findViewById(rGroup.getCheckedRadioButtonId())).getText().toString();
        String correctAnswer = this.getResources().getString(R.string.black_both);

        if (blackKnight == correctAnswer) {
            worthy++;
        }

        if (worthy >= 4) {
            Toast.makeText(this, "You scored " + worthy + ". You may cross the bridge, Sir Knight", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You scored " + worthy + ". Into the pit with you!", Toast.LENGTH_SHORT).show();
        }
    }
}
