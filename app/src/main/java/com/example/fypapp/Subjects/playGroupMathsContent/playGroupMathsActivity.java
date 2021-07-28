package com.example.fypapp.Subjects.playGroupMathsContent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.Subjects.playGroupMathsContent.adpterClas.adpter;

public class playGroupMathsActivity extends AppCompatActivity {
    ViewPager vieww;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_group_maths);
        vieww = (ViewPager) findViewById(R.id.viewpagerid);
        adpter adp = new adpter(this);
        vieww.setAdapter(adp);
    }
}
