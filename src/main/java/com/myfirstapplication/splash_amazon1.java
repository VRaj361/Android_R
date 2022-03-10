package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_amazon1 extends AppCompatActivity {
    GifImageView gid_amazon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_amazon1);
        gid_amazon=findViewById(R.id.splash_amazon_home);
        gid_amazon.setGifImageResource(R.drawable.amazonhome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splash_amazon1.this,home_amazon_1.class);
                startActivity(i);
                finish();
            }
        },6000);

    }
}