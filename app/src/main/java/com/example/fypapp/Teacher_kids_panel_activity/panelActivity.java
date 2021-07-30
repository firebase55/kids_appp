package com.example.fypapp.Teacher_kids_panel_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fypapp.Main_dashboard_kids_panel.MainActivity;
import com.example.fypapp.R;

public class panelActivity extends AppCompatActivity {
    TextView teach, kd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        kd = (TextView)findViewById(R.id.kid_tv);
        kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void login_page(View view)
    {

    }
}