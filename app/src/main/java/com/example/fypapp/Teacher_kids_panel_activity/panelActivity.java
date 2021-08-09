package com.example.fypapp.Teacher_kids_panel_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fypapp.Main_dashboard_kids_panel.MainActivity;
import com.example.fypapp.R;
import com.example.fypapp.Teacher_kids_panel_activity.Registeration.registerationActivity;

public class panelActivity extends AppCompatActivity {
    TextView teach, kd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

    }



    public void kids(View view)
    {
        Intent kidsClass = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(kidsClass);
    }

    public void login_page(View view)
    {
        Intent createAccount = new Intent(getApplicationContext(), registerationActivity.class);
        startActivity(createAccount);
    }
}