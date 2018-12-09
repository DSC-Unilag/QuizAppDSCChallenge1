package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    // To make the next button launch question 3
    public void next(View view){
        Intent i = new Intent(this, Question3Activity.class);
        startActivity(i);
    }

    //To make the back button go to question 1
    public void back(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
