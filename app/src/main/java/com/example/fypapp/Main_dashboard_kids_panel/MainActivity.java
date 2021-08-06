package com.example.fypapp.Main_dashboard_kids_panel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fypapp.Entertainmentmoduel.Fishgamemoduel.splashScreen;
import com.example.fypapp.Entertinment_mainActivity.Entertainment;
import com.example.fypapp.Quiz.QuizMainActivity;
import com.example.fypapp.R;
import com.example.fypapp.Subjects.ClassesActivity;
import com.example.fypapp.Subjects.subjectMaicActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View view)
    {
        new SweetAlertDialog(MainActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Firstly Attemt the Quiz all the give answer must be Correct and then Enjoy Game , Cartoons and Poems !")
                .setConfirmText("Yes")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {

                        Intent gameIntent = new Intent(getApplicationContext(), QuizMainActivity.class);
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

    public void Subject_button(View view)
    {
        Intent subject = new Intent(getApplicationContext(), ClassesActivity.class);
        startActivity(subject);
    }


}
