package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video04);
        VideoView videoView = findViewById(R.id.vidpy01);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vidpy01);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}