package com.example.hp.quizappdscchallenge;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //User's score
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Onclick listener for the submit button
        Button submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateScore();
            }
        });

        // Onclick listener for the reset button
        Button reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
            }
        });
    }


    //To update the score if an answer is gotten right
    public void updateScore(){
        score ++;
    }

    // Calculate the score
        public void calculateScore(){
            // To know if the right option was selected
            RadioButton radioButton = (RadioButton)findViewById(R.id.question_one_answer);
            if (radioButton.isChecked()){
                updateScore();
                // To display a toast message to show that the user is correct
                Toast toast = Toast.makeText(getApplicationContext(), "You are correct!", Toast.LENGTH_SHORT);
                toast.show();
            }
            else {
                // To display a toast message to show that the user is incorrect
                Toast toast = Toast.makeText(getApplicationContext(), "You are incorrect!", Toast.LENGTH_SHORT);
                toast.show();
            }
        }

}
