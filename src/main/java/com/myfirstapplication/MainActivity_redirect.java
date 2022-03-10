package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity_redirect extends AppCompatActivity {
    TextView tvemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_redirect);
//        tvemail=findViewById(R.id.tv_email);
        Intent i_email=getIntent();
        String strEmail=i_email.getStringExtra("KEY_EMAIL");
        tvemail.setText(strEmail);

    }
}