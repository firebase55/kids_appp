package com.example.fypapp.gernelKnowledge.mathsActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.gernelKnowledge.islamic.islamic_adpter;

public class mathsActivityMAin extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_m_ain);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        maths_adpter maths_adpter = new maths_adpter(this);
        viewPager.setAdapter(maths_adpter);
    }
}