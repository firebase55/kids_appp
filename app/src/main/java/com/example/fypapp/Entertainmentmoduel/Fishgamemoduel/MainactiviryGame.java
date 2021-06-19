package com.example.fypapp.Entertainmentmoduel.Fishgamemoduel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.MainActivity;
import com.example.fypapp.R;

import java.util.Timer;
import java.util.TimerTask;

public class MainactiviryGame extends AppCompatActivity {
    private final static long Interval = 30;
    private FlyingFishView gameView;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactiviry_game);
        gameView = new FlyingFishView(this);
        setContentView(gameView);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        gameView.invalidate();
                    }
                });
            }
        }, 0, Interval);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent mainactivity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mainactivity);
    }
}
