package com.example.fypapp.Entertainmentmoduel.cartoons;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fypapp.R;

public class fifthcartoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthcartoon);
    }

    public void fifthcartoon(View view) {
        VideoView videoView = findViewById(R.id.video1);
        Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.jaan);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
