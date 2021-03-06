package com.example.fypapp.Subjects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fypapp.R;
import com.example.fypapp.Subjects.playGroubEnglishContent.EnglishActivity;
import com.example.fypapp.Subjects.playGroupMathsContent.playGroupMathsActivity;

public class ClassesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        CardView playGroup = (CardView) findViewById(R.id.play_group);
        CardView nursery = (CardView) findViewById(R.id.Nursery);
        CardView prep = (CardView) findViewById(R.id.prep);

        playGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent English_content = new Intent(getApplicationContext(), subjectMaicActivity.class);
                startActivity(English_content);
            }
        });
        nursery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent English_content = new Intent(getApplicationContext(), subjectMaicActivity.class);
                startActivity(English_content);
            }
        });
        prep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent English_content = new Intent(getApplicationContext(), subjectMaicActivity.class);
                startActivity(English_content);
            }
        });

    }
}
