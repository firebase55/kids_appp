package com.example.fypapp.gernelKnowledge.bodyParts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.gernelKnowledge.animalsdata.animalclass;

public class body_partsActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_parts);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        body_parts body_adp = new body_parts(this);
        viewPager.setAdapter(body_adp);
    }
}
