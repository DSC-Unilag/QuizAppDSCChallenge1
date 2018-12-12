package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    static int score=0;
    static int score2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score=0;
    }

    // Onclick next
    public void next(View view){
        // figure out if the right option was checked and update the score
       RadioButton radioButton = findViewById(R.id.question_one_answer);
        // figure out if the right option was checked
        if (radioButton.isChecked()) {
            // Update the score
           score++;
        }
        //Open question 2 activity
        Intent i = new Intent(this, Question2Activity.class);
        i.putExtra("com.example.hp.quizappdscchallenge.ScoreKey", score);
        startActivity(i);
    }
}
