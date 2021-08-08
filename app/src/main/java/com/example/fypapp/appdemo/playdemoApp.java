package com.example.fypapp.appdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.fypapp.R;

public class playdemoApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playdemo_app);
        Button playdemo = (Button)findViewById(R.id.play_button);
        playdemo.setOnClickListener(new View.OnClickListener()
        {
            
            @Override
            public void onClick(View v) {
                VideoView videoView = findViewById(R.id.video1);
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.jaan);
                videoView.setVideoURI(uri);
                MediaController mediaController = new MediaController(getApplicationContext());
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                videoView.start();
            }
        });
    }
}
