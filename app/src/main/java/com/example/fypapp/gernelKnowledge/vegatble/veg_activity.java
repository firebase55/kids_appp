package com.example.fypapp.gernelKnowledge.vegatble;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.gernelKnowledge.bodyParts.body_parts;

public class veg_activity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_activity);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        veg_adpter ve_adpter = new veg_adpter(this);
        viewPager.setAdapter(ve_adpter);
    }
}
