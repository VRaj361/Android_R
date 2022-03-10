package com.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class home_amazon4 extends AppCompatActivity {
    TextView rat_i,rat_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_amazon4);
        rat_i=findViewById(R.id.rating_iphone_in);
        rat_a=findViewById(R.id.rating_airpod_in);
        Intent i=getIntent();
        String rati=i.getStringExtra("KEY_RI");
        String ratif="Your Rating : "+rati+"/5.0";
        rat_i.setText(ratif);

        String rata=i.getStringExtra("KEY_RA");
        String rataf="Your Rating : "+rata+"/5.0";
        rat_a.setText(rataf);

    }

    public void alert_btn(View view) {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.bg_home_ig);
        builder.setTitle("Amazon");
        builder.setMessage("Are you sure to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(home_amazon4.this, "No clicked", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }

//    public back


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.bg_home_ig);
        builder.setTitle("Amazon leave");
        builder.setMessage("Are you sure to Leave?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(home_amazon4.this, "No clicked", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }





}