package com.example.fypapp.Entertainmentmoduel.poemspart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.R;

public class poemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
    }

    public void FirstPoem(View view) {
        Intent first_poem = new Intent(getApplicationContext(), Firstpoem.class);
        startActivity(first_poem);
    }
}
