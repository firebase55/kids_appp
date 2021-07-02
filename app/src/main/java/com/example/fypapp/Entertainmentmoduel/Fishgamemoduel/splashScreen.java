package com.example.fypapp.Entertainmentmoduel.Fishgamemoduel;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.R;

public class splashScreen extends AppCompatActivity {
    //jjkj
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent mainIntent = new Intent(splashScreen.this, MainactiviryGame.class);
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();

    }
}
