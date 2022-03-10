package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class reetingBar_seekBar_Value extends AppCompatActivity {

    TextView print_ratingBar,print_seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reeting_bar_seek_bar_value);

        print_ratingBar=findViewById(R.id.print_ratingBar);
        print_seekBar=findViewById(R.id.print_seekBar);

        Intent i=getIntent();
        String pr_ratingBar=i.getStringExtra("KEY_RATING");
        print_ratingBar.setText(pr_ratingBar);

        String pr_seekBar=i.getStringExtra("KEY_SEEK");
        print_seekBar.setText(pr_seekBar);



    }
}