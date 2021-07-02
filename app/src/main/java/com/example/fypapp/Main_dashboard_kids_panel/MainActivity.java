package com.example.fypapp.Main_dashboard_kids_panel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fypapp.Entertinment_mainActivity.Entertainment;
import com.example.fypapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View view)
    {
        Intent newintent = new Intent(getApplicationContext(), Entertainment.class);
        startActivity(newintent);
    }
}
