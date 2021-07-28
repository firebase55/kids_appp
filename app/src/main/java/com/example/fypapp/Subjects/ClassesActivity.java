package com.example.fypapp.Subjects;

import androidx.appcompat.app.AppCompatActivity;

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
        Button playGroup = (Button)findViewById(R.id.play_grop);
        playGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent English_content = new Intent(getApplicationContext(), subjectMaicActivity.class);
                startActivity(English_content);
            }
        });

    }
}
