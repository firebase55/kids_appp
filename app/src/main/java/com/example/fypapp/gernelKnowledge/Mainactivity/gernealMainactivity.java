package com.example.fypapp.gernelKnowledge.Mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fypapp.R;
import com.example.fypapp.gernelKnowledge.animalsdata.animaActivity;
import com.example.fypapp.gernelKnowledge.bodyParts.body_partsActivity;
import com.example.fypapp.gernelKnowledge.Texttospeech.texttospeech;
import com.example.fypapp.gernelKnowledge.islamic.islamic_activity;
import com.example.fypapp.gernelKnowledge.mathsActivity.mathsActivityMAin;
import com.example.fypapp.gernelKnowledge.shapes.shapesMain;
import com.example.fypapp.gernelKnowledge.vegatble.veg_activity;

public class gernealMainactivity extends AppCompatActivity {
private ImageView animal, parts, veg, islamic,maths,shaps,speech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerneal_mainactivity);
        animal = (ImageView) findViewById(R.id.animals_id);
        parts = (ImageView) findViewById(R.id.body_parts_id);
        veg = (ImageView) findViewById(R.id.vegtable);
        islamic = (ImageView) findViewById(R.id.islamic_name_id);
        maths = (ImageView) findViewById(R.id.maths_id);
        shaps = (ImageView) findViewById(R.id.shapes_id);
        speech = (ImageView) findViewById(R.id.text_to_speech_id);
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animal = new Intent(getApplicationContext(), animaActivity.class);
                startActivity(animal);

            }
        });
        parts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent body_parts = new Intent(getApplicationContext(), body_partsActivity.class);
                startActivity(body_parts);

            }
        });
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent veg = new Intent(getApplicationContext(), veg_activity.class);
                startActivity(veg);

            }
        });
        islamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent islamic = new Intent(getApplicationContext(), islamic_activity.class);
                startActivity(islamic);

            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maths = new Intent(getApplicationContext(), mathsActivityMAin.class);
                startActivity(maths);

            }
        });
        shaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shapes = new Intent(getApplicationContext(), shapesMain.class);
                startActivity(shapes);

            }
        });
        speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent speech = new Intent(getApplicationContext(), texttospeech.class);
                startActivity(speech);

            }
        });

    }
}
