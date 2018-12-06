package com.example.hp.quizappdscchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
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
                calculateScoreAndGetAnswer();
            }
        });

        // Onclick listener for the reset button
        Button reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                calculateScoreAndGetAnswer();
                setInvisibility();
            }
        });

        setInvisibility();
    }


    //To update the score if an answer is gotten right
    public void updateScore(){
        score ++;
    }

    // Calculate the score and display correct answer
        public void calculateScoreAndGetAnswer(){
            // To know if the right option was selected for question 1
            RadioButton question1Answer = (RadioButton)findViewById(R.id.question_one_answer);
            String string = getString(R.string.one_a);
            if (question1Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);

            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }

            // To know if the right option was selected for question 2
            RadioButton question2Answer = (RadioButton)findViewById(R.id.question_two_answer);
            string = getString(R.string.two_c);
            if (question2Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer2_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);

            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer2_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }

            // To know if the right option was selected for question 3
            RadioButton question3Answer = (RadioButton)findViewById(R.id.question_three_answer);
            string = getString(R.string.three_b);
            if (question3Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer3_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);

            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer3_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }

            // To know if the right option was selected for question 4
            RadioButton question4Answer = (RadioButton)findViewById(R.id.question_four_answer);
            string = getString(R.string.four_b);
            if (question4Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer4_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);

            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer4_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }

            // To know if the right option was selected for question 5
            RadioButton question5Answer = (RadioButton)findViewById(R.id.question_five_answer);
           string = getString(R.string.five_a);
            if (question5Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer5_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer5_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }


            // To know if the right option was selected for question 6
            RadioButton question6Answer = (RadioButton)findViewById(R.id.question_six_answer);
            string = getString(R.string.six_a);
            if (question6Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer6_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer6_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }

            // To know if the right option was selected for question 7
            RadioButton question7Answer = (RadioButton)findViewById(R.id.question_seven_answer);
            string = getString(R.string.seven_a);
            if (question7Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer7_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer7_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }


            // To know if the right option was selected for question 8
            RadioButton question8Answer = (RadioButton)findViewById(R.id.question_eight_answer);
           string = getString(R.string.eight_b);
            if (question8Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer8_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer8_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }

            // To know if the right option was selected for question 9
            RadioButton question9Answer = (RadioButton)findViewById(R.id.question_nine_answer);
             string = getString(R.string.nine_a);
            if (question9Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer9_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer9_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }

            // To know if the right option was selected for question 10
            RadioButton question10Answer = (RadioButton)findViewById(R.id.question_ten_answer);
            string = getString(R.string.ten_c);
            if (question10Answer.isChecked()){
                updateScore();
                // To display correct answer and show that user is right
                TextView answerTextView = (TextView)findViewById(R.id.answer10_text_view);
                answerTextView.setText("Correct. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }
            else {
                // To display correct answer and show that user is wrong
                TextView answerTextView = (TextView)findViewById(R.id.answer10_text_view);
                answerTextView.setText("Wrong. The answer is " + string);
                answerTextView.setVisibility(View.VISIBLE);
            }
        }

        //To initially set invisibility of the answer text view
        public void setInvisibility(){
            //To set invisibility for question 1
            TextView answerTextView = (TextView)findViewById(R.id.answer_text_view);
            answerTextView.setVisibility(View.GONE);

            //To set invisibility for question 2
            TextView answer2TextView = (TextView)findViewById(R.id.answer2_text_view);
            answer2TextView.setVisibility(View.GONE);

            //To set invisibility for question 3
            TextView answer3TextView = (TextView)findViewById(R.id.answer3_text_view);
            answer3TextView.setVisibility(View.GONE);

            //To set invisibility for question 4
            TextView answer4TextView = (TextView)findViewById(R.id.answer4_text_view);
            answer4TextView.setVisibility(View.GONE);

            //To set invisibility for question 5
            TextView answer5TextView = (TextView)findViewById(R.id.answer5_text_view);
            answer5TextView.setVisibility(View.GONE);

            //To set invisibility for question 6
            TextView answer6TextView = (TextView)findViewById(R.id.answer6_text_view);
            answer6TextView.setVisibility(View.GONE);

            //To set invisibility for question 7
            TextView answer7TextView = (TextView)findViewById(R.id.answer7_text_view);
            answer7TextView.setVisibility(View.GONE);

            //To set invisibility for question 8
            TextView answer8TextView = (TextView)findViewById(R.id.answer8_text_view);
            answer8TextView.setVisibility(View.GONE);

            //To set invisibility for question 9
            TextView answer9TextView = (TextView)findViewById(R.id.answer9_text_view);
            answer9TextView.setVisibility(View.GONE);

            //To set invisibility for question 10
            TextView answer10TextView = (TextView)findViewById(R.id.answer10_text_view);
            answer10TextView.setVisibility(View.GONE);
        }
}
