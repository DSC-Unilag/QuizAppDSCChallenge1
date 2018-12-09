package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
    }

    // To make the next button launch question 10
    public void next(View view){
        Intent i = new Intent(this, Question10Activity.class);
        startActivity(i);
    }

    //To make the back button go to question 8
    public void back(View view){
        Intent i = new Intent(this, Question8Activity.class);
        startActivity(i);
    }
}
