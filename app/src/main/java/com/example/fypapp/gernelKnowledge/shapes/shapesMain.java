package com.example.fypapp.gernelKnowledge.shapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.gernelKnowledge.mathsActivity.maths_adpter;

public class shapesMain extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes_main);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        shapes_adpter  shapes = new shapes_adpter(this);
        viewPager.setAdapter(shapes);
    }
}
