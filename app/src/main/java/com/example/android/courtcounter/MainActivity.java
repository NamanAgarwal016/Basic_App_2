package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayScoreA(int number){
        TextView counterA = (TextView)findViewById(R.id.counter_A);
        counterA.setText("" + number);
    }
    private void displayScoreB(int number){
        TextView counterB = (TextView)findViewById(R.id.counter_B);
        counterB.setText("" + number);
    }
    private void displayResult(String Message){
        TextView result = (TextView)findViewById(R.id.result);
        result.setText(Message);
    }

    public void plus3A(View view){
        scoreA+=3;
        displayScoreA(scoreA);
    }
    public void plus2A(View view){
        scoreA+=2;
        displayScoreA(scoreA);
    }
    public void plus1A(View view){
        scoreA+=1;
        displayScoreA(scoreA);
    }
    public void plus3B(View view){
        scoreB+=3;
        displayScoreB(scoreB);
    }
    public void plus2B(View view){
        scoreB+=2;
        displayScoreB(scoreB);
    }
    public void plus1B(View view){
        scoreB+=1;
        displayScoreB(scoreB);
    }

    public void reset(View view){
        String result = "Team A: " + scoreA + "\t\t\tTeam B: " + scoreB;
        if(scoreA>scoreB)result = result + "\nA won by " + (scoreA-scoreB) + " points";
        else if(scoreA<scoreB)result = result + "\nB won by " + (scoreB-scoreA) + " points";
        else if(scoreA==scoreB)result = result + "\nThere\'s a TIE!!!";

        displayResult(result);

        scoreA = 0;
        scoreB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }

}
