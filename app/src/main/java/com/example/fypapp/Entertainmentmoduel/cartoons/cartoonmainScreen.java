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

    public void car2(View view) {
        Intent second_cartoon = new Intent(getApplicationContext(), secondcartoon.class);
        startActivity(second_cartoon);

    }

    public void car3(View view) {
        Intent third_cartoon = new Intent(getApplicationContext(), thirdcartoon.class);
        startActivity(third_cartoon);
    }

    public void car4(View view) {
        Intent fourth_cartoon = new Intent(getApplicationContext(), fourthcartoon.class);
        startActivity(fourth_cartoon);
    }
}
