package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreVisitor = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHome(0);
    }

    /**
     * Displays the given score for the Home Team.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for the Visitor Team.
     */
    public void displayForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for home by 7 for touchdown.
     */
    public void homeTouchdown(View v) {
        scoreHome = scoreHome + 7;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for home by 3 for field goal.
     */
    public void homeFieldGoal(View v) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for home by for an extra point.
     */
    public void homeExtraPoint(View v) {
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for home by 2 for 2 point conversion.
     */
    public void homeTwoPointConv(View v) {
        scoreHome = scoreHome + 2;
        displayForHome(scoreHome);
    }


    /**
     * Increase the score for home by 2 for a safety.
     */
    public void homeSafety(View v) {
        scoreHome = scoreHome + 2;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for visitor by 7 for touchdown.
     */
    public void visitorTouchdown(View v) {
        scoreVisitor = scoreVisitor + 7;
        displayForVisitor(scoreVisitor);
    }

    /**
     * Increase the score for visitor by 3 for field goal.
     */
    public void visitorFieldGoal(View v) {
        scoreVisitor = scoreVisitor + 3;
        displayForVisitor(scoreVisitor);
    }

    /**
     * Increase the score for visitor by for an extra point.
     */
    public void visitorExtraPoint(View v) {
        scoreVisitor = scoreVisitor + 1;
        displayForVisitor(scoreVisitor);
    }

    /**
     * Increase the score for visitor by 2 for 2 point conversion.
     */
    public void visitorTwoPointConv(View v) {
        scoreVisitor = scoreVisitor + 2;
        displayForVisitor(scoreVisitor);
    }

    /**
     * Increase the score for visitor by 2 for a safety.
     */
    public void visitorSafety(View v) {
        scoreVisitor = scoreVisitor + 2;
        displayForVisitor(scoreVisitor);
    }

    public void resetScore(View v) {
        scoreHome = 0;
        scoreVisitor = 0;
        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
    }
}