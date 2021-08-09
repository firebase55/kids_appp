package com.example.fypapp.teacherpanel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fypapp.Main_dashboard_kids_panel.MainActivity;
import com.example.fypapp.R;
import com.example.fypapp.applocker.applockmain;
import com.example.fypapp.applocker.ui.util.GlobalMethods;
import com.example.fypapp.teacherpanel.chatModuel.MainChatActivity;

public class teacherActivity extends AppCompatActivity {
CardView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        CardView cardView = (CardView)findViewById(R.id.chatButton);
        act = (CardView) findViewById(R.id.activity_control);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), applockmain.class);
                startActivity(intent);

            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chat = new Intent(getApplicationContext(), MainChatActivity.class);
                startActivity(chat);
            }
        });

    }

    private void blockSocialMediaApps(){
        String[] socialApps = {"com.whatsapp" , "com.adil"};
        for(int i = 0; i < socialApps.length; i++){
            GlobalMethods.addAppToBlock(teacherActivity.this , socialApps[i]);
        }
    }




}