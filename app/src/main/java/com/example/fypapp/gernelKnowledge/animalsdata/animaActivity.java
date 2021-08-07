package com.example.fypapp.gernelKnowledge.animalsdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.Subjects.playGroubEnglishContent.EnglishAdpter.Eng_adpter;

public class animaActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anima);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        animalclass animal_adp = new animalclass(this);
        viewPager.setAdapter(animal_adp);
    }
}
