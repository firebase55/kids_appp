package com.example.fypapp.Subjects.playGroubEnglishContent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewParent;

import com.example.fypapp.R;
import com.example.fypapp.Subjects.playGroubEnglishContent.EnglishAdpter.Eng_adpter;
import com.example.fypapp.Subjects.playGroupMathsContent.adpterClas.adpter;

public class EnglishActivity extends AppCompatActivity {
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        Eng_adpter adp = new Eng_adpter(this);
        viewPager.setAdapter(adp);
    }
}
