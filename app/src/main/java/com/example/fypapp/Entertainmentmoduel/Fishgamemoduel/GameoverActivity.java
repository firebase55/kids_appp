package com.example.fypapp.Entertainmentmoduel.Fishgamemoduel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.MainActivity;
import com.example.fypapp.R;

public class GameoverActivity extends AppCompatActivity {
    private Button StartGameAgain;

    private TextView DisplayScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);
        score = getIntent().getExtras().get("score").toString();

        StartGameAgain = findViewById(R.id.play_again_btn);
        DisplayScore = findViewById(R.id.displayScore);


        StartGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainIntent = new Intent(GameoverActivity.this, MainactiviryGame.class);
                startActivity(mainIntent);
            }
        });
        DisplayScore.setText("Score= " + score);
    }

    public void exit(View view) {
        Intent mainactivity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mainactivity);
    }
}
