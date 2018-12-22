package com.example.hp.quizappdscchallenge;

import android.content.Intent;
import android.net.Uri;
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

    //OnClick View my story
    public void viewMyStory(View view){
        String url = "https://twitter.com/paimo_emmanuel/status/1076446087802703872?s=09";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
