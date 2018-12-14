package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    static String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // OnClick start quiz
    public void startQuiz(View view){
        Intent intent = new Intent(this, Question1Activity.class);
        startActivity(intent);

        EditText edit = (EditText)findViewById(R.id.edit_text);
        userName = edit.getText().toString();
    }
}
