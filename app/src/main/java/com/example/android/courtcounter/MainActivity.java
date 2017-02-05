package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int offsideTeamA = 0;
    int penaltyTeamA = 0;
    int offsideTeamB = 0;
    int penaltyTeamB = 0;

    TextView scoreViewA;
    TextView offsideViewA;
    TextView penaltyViewA;
    TextView scoreViewB;
    TextView offsideViewB;
    TextView penaltyViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        scoreViewA = (TextView)findViewById(R.id.team_a_score);
        offsideViewA = (TextView) findViewById(R.id.team_a_offside);
        penaltyViewA = (TextView) findViewById(R.id.team_a_penalty);
        scoreViewB = (TextView)findViewById(R.id.team_b_score);
        offsideViewB = (TextView) findViewById(R.id.team_b_offside);
        penaltyViewB = (TextView) findViewById(R.id.team_b_penalty);

        if (savedInstanceState != null) {
            String teamA_score = savedInstanceState.getString("team_a_score");
            scoreViewA.setText(teamA_score);
            String teamA_offside = savedInstanceState.getString("team_a_offside");
            offsideViewA.setText(teamA_offside);
            String teamA_penalty = savedInstanceState.getString("team_a_penalty");
            penaltyViewA.setText(teamA_penalty);
            String teamB_score = savedInstanceState.getString("team_b_score");
            scoreViewB.setText(teamB_score);
            String teamB_offside = savedInstanceState.getString("team_b_offside");
            offsideViewB.setText(teamB_offside);
            String teamB_penalty = savedInstanceState.getString("team_b_penalty");
            penaltyViewB.setText(teamB_penalty);
        }
    }
      @Override
    public void onSaveInstanceState(Bundle save)
    {
        save.putString("team_a_score",String.valueOf(scoreViewA.getText()));
        save.putString("team_a_offside",String.valueOf(offsideViewA.getText()));
        save.putString("team_a_penalty",String.valueOf(penaltyViewA.getText()));
        save.putString("team_b_score",String.valueOf(scoreViewB.getText()));
        save.putString("team_b_offside",String.valueOf(offsideViewB.getText()));
        save.putString("team_b_penalty",String.valueOf(penaltyViewB.getText()));

        super.onSaveInstanceState(save);

    }

    public void addOffsideForTeamA (View View){
        offsideTeamA = offsideTeamA + 1;
        displayOffsidesForTeamA(offsideTeamA);

    }

    public void addPenaltyForTeamA (View View){
        penaltyTeamA = penaltyTeamA + 1;
         displayPenaltiesForTeamA(penaltyTeamA);
    }

    public void addOneForTeamA (View View){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOffsideForTeamB (View View){
        offsideTeamB = offsideTeamB + 1;
          displayOffsidesForTeamB(offsideTeamB);

    }

    public void addPenaltyForTeamB (View View){
        penaltyTeamB = penaltyTeamB + 1;
        displayPenaltiesForTeamB(penaltyTeamB);

    }

    public void addOneForTeamB (View View){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore (View View){

        scoreTeamA = 0;
        offsideTeamA = 0;
        penaltyTeamA = 0;
        offsideTeamB = 0;
        scoreTeamB = 0;
        penaltyTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayOffsidesForTeamA(offsideTeamA);
        displayPenaltiesForTeamA(penaltyTeamA);
        displayForTeamB(scoreTeamB);
        displayOffsidesForTeamB(offsideTeamA);
        displayPenaltiesForTeamB(penaltyTeamA);

    }

    public void displayForTeamA(int score) {
        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayOffsidesForTeamA(int score) {
        offsideViewA = (TextView) findViewById(R.id.team_a_offside);
        offsideViewA.setText(String.valueOf(score));
    }

    public void displayPenaltiesForTeamA(int score) {
        penaltyViewA = (TextView) findViewById(R.id.team_a_penalty);
        penaltyViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }


    public void displayOffsidesForTeamB(int score) {
       offsideViewB = (TextView) findViewById(R.id.team_b_offside);
        offsideViewB.setText(String.valueOf(score));
    }

    public void displayPenaltiesForTeamB(int score) {
         penaltyViewB = (TextView) findViewById(R.id.team_b_penalty);
        penaltyViewB.setText(String.valueOf(score));
    }

}