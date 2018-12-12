package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question3Activity extends AppCompatActivity {

    static int score;
    static int score2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        // To get intent previous activity
        Intent i = getIntent();
        score = i.getIntExtra("com.example.hp.quizappdscchallenge.ScoreKey", 0);
        score2 = i.getIntExtra("com.example.hp.quizappdscchallenge.ScoreKey", 0);
    }

    // Onclick next
    public void next(View view){
        // figure out if the right option was checked and update the score
        RadioButton radioButton = (RadioButton) findViewById(R.id.question_three_answer);
        // figure out if the right option was checked
        if (radioButton.isChecked()) {
            // Update the score
            score++;
        }
        //Open question 4 activity
        Intent i = new Intent(this, Question4Activity.class);
        i.putExtra("com.example.hp.quizappdscchallenge.ScoreKey", score);
        startActivity(i);
    }
    //OnClick back
    public void back(View view){
            // Update the score
            Question2Activity.score = Question2Activity.score2;
        //To end current activity
        finish();
        }
}
