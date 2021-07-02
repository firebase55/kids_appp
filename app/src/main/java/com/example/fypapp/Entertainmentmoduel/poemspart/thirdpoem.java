package com.example.fypapp.Entertainmentmoduel.poemspart;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.R;

public class thirdpoem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpoem);
    }

    public void third_poem(View view) {
        VideoView videoView = findViewById(R.id.video1);
        Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.chanda);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
