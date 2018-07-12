package com.example.tiffany.montypythonquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        String knightName = "";
        String land = "";
        String magicianTim = "";

        EditText nameInput = (EditText) findViewById(R.id.knight_name_answer);
        knightName = nameInput.getText().toString();

        if ((knightName.toLowerCase().indexOf("lancelot") > -1) ||
            (knightName.toLowerCase().indexOf("robin") > -1) ||
            (knightName.toLowerCase().indexOf("bedevere") > -1) ||
            (knightName.toLowerCase().indexOf("galahad") > -1)) {
                worthy++;
        }

        // knights hail from Camelot. Round table is also acceptable
        EditText landInput = (EditText) findViewById(R.id.knight_land_answer);
        land = landInput.getText().toString();

        if ((land.toLowerCase().indexOf("camelot") > -1) || (land.toLowerCase().indexOf("round table") > -1)) {
            worthy++;
        }

        // All of the black knight's limbs are severed
        CheckBox armsCheckBox = (CheckBox) findViewById(R.id.black_arms);
        CheckBox legsCheckBox = (CheckBox) findViewById(R.id.black_legs);
        CheckBox headCheckBox = (CheckBox) findViewById(R.id.black_head);
        boolean arms = armsCheckBox.isChecked();
        boolean legs = legsCheckBox.isChecked();
        boolean head = headCheckBox.isChecked();

        if (arms && legs && !head) {
            worthy++;
        }

        // Tim the Enchanter is who they encounter
        RadioGroup rGroup = (RadioGroup) findViewById(R.id.magician_group);
        magicianTim = ((RadioButton)findViewById(rGroup.getCheckedRadioButtonId())).getText().toString();
        String correctAnswer = this.getResources().getString(R.string.question_magician_tim);

        if (magicianTim == correctAnswer) {
            worthy++;
        }

        if (worthy >= 4) {
            Toast.makeText(this, "You scored " + worthy + ". You may cross the bridge, Sir Knight", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You scored " + worthy + ". Into the pit with you!", Toast.LENGTH_SHORT).show();
        }
    }
}
