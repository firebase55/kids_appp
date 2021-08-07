package com.example.fypapp.gernelKnowledge.islamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.gernelKnowledge.bodyParts.body_parts;

public class islamic_activity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamic_activity);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        islamic_adpter  islamic_adpter = new islamic_adpter(this);
        viewPager.setAdapter(islamic_adpter);
    }
}
