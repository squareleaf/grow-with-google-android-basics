package com.example.android.cardwarsscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreFinn = 25;
    int scoreJake = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForFinn(int score) {
        TextView jakeScoreView = (TextView) findViewById(R.id.jake_score);
        TextView finnScoreView = (TextView) findViewById(R.id.finn_score);
        if (scoreFinn <= 0) {
            jakeScoreView.setText(R.string.winner);
            finnScoreView.setText(R.string.loser);
        } else {
            finnScoreView.setText(String.valueOf(score));
        }
    }

    public void loseOneFinn(View view) {
        scoreFinn = scoreFinn - 1;
        displayForFinn(scoreFinn);
    }

    public void loseThreeFinn(View view) {
        scoreFinn = scoreFinn - 3;
        displayForFinn(scoreFinn);
    }

    public void addOneFinn(View view) {
        scoreFinn = scoreFinn + 1;
        displayForFinn(scoreFinn);
    }

    public void displayForJake(int score) {
        TextView jakeScoreView = (TextView) findViewById(R.id.jake_score);
        TextView finnScoreView = (TextView) findViewById(R.id.finn_score);
        if (scoreJake <= 0) {
            jakeScoreView.setText(R.string.loser);
            finnScoreView.setText(R.string.winner);
        } else {
            jakeScoreView.setText(String.valueOf(score));
        }
    }

    public void loseOneJake(View view) {
        scoreJake = scoreJake - 1;
        displayForJake(scoreJake);
    }

    public void loseThreeJake(View view) {
        scoreJake = scoreJake - 3;
        displayForJake(scoreJake);
    }

    public void addOneJake(View view) {
        scoreJake = scoreJake + 1;
        displayForJake(scoreJake);
    }

    public void resetScore(View view) {
        scoreFinn = 25;
        scoreJake = 25;
        displayForFinn(scoreFinn);
        displayForJake(scoreJake);
    }
}