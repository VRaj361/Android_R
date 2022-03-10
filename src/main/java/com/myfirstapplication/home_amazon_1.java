package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_amazon_1 extends AppCompatActivity {
    Button btn_openinbrowser,btn_opensubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_amazon1);
        btn_openinbrowser=findViewById(R.id.btn_openbroswer);
        btn_openinbrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/"));
                startActivity(i);
            }
        });


        btn_opensubmit=findViewById(R.id.btn_submit_amazon);
        btn_opensubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home_amazon_1.this,home_amazon2.class);
                startActivity(i);
                finish();
            }
        });


    }
}