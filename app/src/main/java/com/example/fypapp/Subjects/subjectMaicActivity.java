package com.example.fypapp.Subjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fypapp.R;
import com.example.fypapp.Subjects.playGroubEnglishContent.EnglishActivity;
import com.example.fypapp.Subjects.playGroupMathsContent.playGroupMathsActivity;
import com.example.fypapp.Subjects.urdu.urduMainActivity;

public class subjectMaicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_maic);
        Button maths = (Button)findViewById(R.id.maths_button);
        Button English = (Button)findViewById(R.id.English_button);
        Button Urdu = (Button)findViewById(R.id.Urdu);
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classes = new Intent(getApplicationContext(), playGroupMathsActivity.class);
                startActivity(classes);
            }
        });
        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enclass = new Intent(getApplicationContext(), EnglishActivity.class);
                startActivity(enclass);
            }
        });
        Urdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urdu = new Intent(getApplicationContext(), urduMainActivity.class);
                startActivity(urdu);
            }
        });


    }
}
