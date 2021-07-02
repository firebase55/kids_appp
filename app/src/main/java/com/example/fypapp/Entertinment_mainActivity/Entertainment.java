package com.example.fypapp.Entertinment_mainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.Entertainmentmoduel.Fishgamemoduel.splashScreen;
import com.example.fypapp.Entertainmentmoduel.cartoons.cartoonmainScreen;
import com.example.fypapp.Entertainmentmoduel.poemspart.poemActivity;
import com.example.fypapp.R;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Entertainment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

    }

    public void dilogbox(View view) {
        new SweetAlertDialog(Entertainment.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Do you want play Game")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        Intent gameIntent = new Intent(getApplicationContext(), splashScreen.class);
                        startActivity(gameIntent);

                    }
                })
                .setCancelText("No")
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        sDialog.dismissWithAnimation();

                    }
                })
                .show();
    }

    public void cartoonactivity(View view) {
        Intent cartoonIntent = new Intent(getApplicationContext(), cartoonmainScreen.class);
        startActivity(cartoonIntent);
    }

    public void poemActivity(View view) {
        Intent poemintent = new Intent(getApplicationContext(), poemActivity.class);
        startActivity(poemintent);
    }
}
