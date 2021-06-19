package com.example.fypapp.Entertainmentmoduel.cartoons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.R;

public class cartoonmainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoonmain_screen);
    }

    public void firstCartoon(View view) {
        Intent first_Cartoon = new Intent(getApplicationContext(), firstcartoon.class);
        startActivity(first_Cartoon);
    }
}
