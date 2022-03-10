package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class signup_redirect extends AppCompatActivity {
    TextView name;
    TextView email,pass1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_redirect);
        email=findViewById(R.id.tv1_email);
        pass1=findViewById(R.id.tv1_pass);
        name=findViewById(R.id.tv1_name);

        Intent i= getIntent();

        String strEmail=i.getStringExtra("KEY_EMAIL");
        email.setText(strEmail);

        String name1=i.getStringExtra("KEY_NAME");
        name.setText(name1);

        String pass=i.getStringExtra("KEY_PASS");
        pass1.setText(pass);
    }
}