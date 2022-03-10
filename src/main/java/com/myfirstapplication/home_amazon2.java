package com.myfirstapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class home_amazon2 extends AppCompatActivity {
    SeekBar seek_bar_iphone,seek_bar_airpod;
    String seek_iphone,seek_airpod;
    private TextView seek_iphone_text,seek_airpod_text;
    Button btn_sub;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_amazon2);

        seek_bar_iphone=findViewById(R.id.seekBar_amazon_iphone);
        seek_bar_airpod=findViewById(R.id.seekBar_amazon_airpod);

        seek_iphone_text=(TextView) findViewById(R.id.amazon_seekBar_iphone);
        seek_airpod_text=(TextView) findViewById(R.id.amazon_seekBar_airpod);

        btn_sub=findViewById(R.id.btn_submit_bill);
        seek_bar_iphone.setMax(10);
        seek_bar_iphone.setMin(1);
        seek_bar_airpod.setMax(10);
        seek_bar_airpod.setMin(1);

        seek_bar_iphone.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seek_iphone_text.setText(String.valueOf(progress));
                seek_iphone=String.valueOf(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





        seek_bar_airpod.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seek_airpod_text.setText(String.valueOf(progress));
                seek_airpod=String.valueOf(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home_amazon2.this,home_amazon3.class);
                i.putExtra("KEY_IPHONE",seek_iphone);
                i.putExtra("KEY_AIRPOD",seek_airpod);
                startActivity(i);
                finish();
            }
        });


    }
}