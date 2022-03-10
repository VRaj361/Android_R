package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    int time=3000;
    GifImageView giw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
            giw=findViewById(R.id.android_main);
            giw.setGifImageResource(R.drawable.android_image);

        new Handler().postDelayed(new Runnable() {//handler class which is based on web view
            //use runnable method for internally thread
            @Override
            public void run() {
//                Intent i= new Intent(SplashActivity.this,seekBar_ratingBar.class);
                Intent i= new Intent(SplashActivity.this,Browser_gallery_button.class);
                startActivity(i);
                finish();
            }//override method in Run method


        },time);//postdelayed  contain two method


    }



}