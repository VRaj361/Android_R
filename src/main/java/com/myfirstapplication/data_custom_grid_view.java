package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class data_custom_grid_view extends AppCompatActivity {

    ImageView img;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_custom_grid_view);
        text=findViewById(R.id.data_custom_view_redirect_text);
        img=findViewById(R.id.data_custom_view_redirect_img);
        Intent intent=getIntent();
        String str=intent.getStringExtra("GRIDTXTDATA");
        int img1=intent.getIntExtra("GRIDIMGDATA",0);
        img.setImageResource(img1);



        text.setText(str);

    }
}