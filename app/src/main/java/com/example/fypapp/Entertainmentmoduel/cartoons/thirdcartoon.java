package com.example.fypapp.Entertainmentmoduel.cartoons;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.R;

public class thirdcartoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdcartoon);
    }

    public void third_cartoon(View view) {
        VideoView videoView = findViewById(R.id.video1);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.m);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
