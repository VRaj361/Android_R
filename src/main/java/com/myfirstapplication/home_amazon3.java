package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class home_amazon3 extends AppCompatActivity {
    TextView seek_airpod,seek_iphone,final_airpod,final_iphone,final_amount;
    RatingBar rating_iphone,rating_airpod;
    String rating_valuei,rating_valuea;
    Button btn_feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_amazon3);

        //rating bar
        rating_iphone=findViewById(R.id.rating_iphone);
        rating_airpod=findViewById(R.id.rating_airpod);

        //for quantity
        seek_airpod=findViewById(R.id.seek_value_airpod);
        seek_iphone=findViewById(R.id.seek_value_iphone);

        //for final value
        final_iphone=findViewById(R.id.final_iphone);
        final_airpod=findViewById(R.id.final_airpod);

        //for final amount
        final_amount=findViewById(R.id.final_amount);

        //btn feedback
        btn_feedback=findViewById(R.id.btn_submit_feedback);

        Intent i=getIntent();
//        String iphone="Qty. NO - "+i.getStringExtra("KEY_IPHONE");
//        seek_iphone.setText(iphone);
//
//        String airpod="Qty. NO - "+i.getStringExtra("KEY_AIRPOD");
//        seek_airpod.setText(airpod);
        String iphone=i.getStringExtra("KEY_IPHONE");
        String iq="Qty. No - "+iphone;
        seek_iphone.setText(iq);

        String airpod=i.getStringExtra("KEY_AIRPOD");
        String aq="Qty. No - "+airpod;
        seek_airpod.setText(aq);

//        String finaliphone="Rs. "+Integer.toString(Integer.parseInt(iphone)*159900);
//        final_iphone.setText(finaliphone);
//
//        String finalairpod="Rs. "+Integer.toString(Integer.parseInt(airpod)*18500);
//        final_airpod.setText(finalairpod);

        String finaliphone=Integer.toString(Integer.parseInt(iphone)*159900);
        String istr="Rs. "+finaliphone;
        final_iphone.setText(istr);

        String finalairpod=Integer.toString(Integer.parseInt(airpod)*18500);
        String astr="Rs. "+finalairpod;
        final_airpod.setText(astr);

//"Total Bill :- "+
        String finalamount=Integer.toString(Integer.parseInt(finaliphone)+Integer.parseInt(finalairpod));
        String thi="Total Bill :- "+finalamount;
        final_amount.setText(thi);


        rating_iphone.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rating_valuei=String.valueOf(rating);
            }
        });

        rating_airpod.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rating_valuea=String.valueOf(rating);
            }
        });

        btn_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home_amazon3.this,home_amazon4.class);
                i.putExtra("KEY_RI",rating_valuei);
                i.putExtra("KEY_RA",rating_valuea);
                startActivity(i);
                finish();
            }
        });

    }
}