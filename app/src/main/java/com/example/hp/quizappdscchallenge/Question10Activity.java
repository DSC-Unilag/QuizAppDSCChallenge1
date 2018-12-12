package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question10Activity extends AppCompatActivity {

    int score;
    int score2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        // To get intent previous activity
        Intent i = getIntent();
        score = i.getIntExtra("com.example.hp.quizappdscchallenge.ScoreKey", 0);
        score2 = i.getIntExtra("com.example.hp.quizappdscchallenge.ScoreKey", 0);
    }

    //OnClick back
    public void back(View view){
        //To end current activity
        Question9Activity.score = Question9Activity.score2;
        finish();

    }

    public void submit(View view){
        RadioButton radioButton = findViewById(R.id.question_ten_answer);
        // figure out if the right option was checked
        if (radioButton.isChecked()) {
            // Update the score
            score++;
        }
        Toast.makeText(getApplicationContext(), "score is " + score, Toast.LENGTH_SHORT).show();
        score = score2;
    }

    public void reset(View view){
        MainActivity.score = 0;
        //To go back to the first question
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
