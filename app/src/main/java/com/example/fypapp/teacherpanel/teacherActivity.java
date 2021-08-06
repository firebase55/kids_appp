package com.example.fypapp.teacherpanel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fypapp.Main_dashboard_kids_panel.MainActivity;
import com.example.fypapp.R;
import com.example.fypapp.teacherpanel.chatModuel.MainChatActivity;

public class teacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        CardView cardView = (CardView)findViewById(R.id.chatButton);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chat = new Intent(getApplicationContext(), MainChatActivity.class);
                startActivity(chat);
            }
        });
    }
}