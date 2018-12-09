package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
    }

    // To make the next button launch question 9
    public void next(View view){
        Intent i = new Intent(this, Question9Activity.class);
        startActivity(i);
    }

    //To make the back button go to question 7
    public void back(View view){
        Intent i = new Intent(this, Question7Activity.class);
        startActivity(i);
    }
}
