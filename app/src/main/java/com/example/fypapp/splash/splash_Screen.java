package com.example.fypapp.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;

import com.example.fypapp.MainActivity;
import com.example.fypapp.R;
import com.example.fypapp.panelActivity;

public class splash_Screen extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen_launch);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(splash_Screen.this, panelActivity.class);
                splash_Screen.this.startActivity(mainIntent);
                splash_Screen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}