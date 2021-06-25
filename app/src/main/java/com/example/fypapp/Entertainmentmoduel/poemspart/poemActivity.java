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

    public void peom2(View view) {
        Intent second_poem = new Intent(getApplicationContext(), secondpoem.class);
        startActivity(second_poem);

    }

    public void poem3(View view) {
        Intent thirdpoem = new Intent(getApplicationContext(), thirdpoem.class);
        startActivity(thirdpoem);
    }

    public void poem4(View view) {
        Intent fourth_poem = new Intent(getApplicationContext(), fourthpoem.class);
        startActivity(fourth_poem);
    }

    public void poem5(View view) {
        Intent fifth_poem = new Intent(getApplicationContext(), fivethpoem.class);
        startActivity(fifth_poem);
    }
}
