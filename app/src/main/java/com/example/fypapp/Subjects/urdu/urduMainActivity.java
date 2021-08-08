package com.example.fypapp.Subjects.urdu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fypapp.R;
import com.example.fypapp.Subjects.playGroupMathsContent.adpterClas.adpter;

public class urduMainActivity extends AppCompatActivity {
ViewPager vieww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu_main);
        vieww = (ViewPager) findViewById(R.id.viewpagerid);
        urdu_adpter urdu_adpter = new urdu_adpter(this);
        vieww.setAdapter(urdu_adpter);
    }
}
