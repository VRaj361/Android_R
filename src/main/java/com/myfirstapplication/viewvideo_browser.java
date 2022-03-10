package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class viewvideo_browser extends AppCompatActivity {
    VideoView videoview_brower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewvideo_browser);
        videoview_brower=findViewById(R.id.videoview_brower);
        String str="android.resource://"+getPackageName()+"/"+R.raw.videoshort;
        videoview_brower.setVideoPath(str);
        MediaController mediaController=new MediaController(this);
        videoview_brower.setMediaController(mediaController);
        videoview_brower.start();
    }
}