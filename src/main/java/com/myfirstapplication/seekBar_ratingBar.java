package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class seekBar_ratingBar extends AppCompatActivity {

    SeekBar seekBar;
    String rating_value,seek_value;
    private TextView tvData ,tvRatingBar;
//    TextView rating_value,seek_value;
    RatingBar ratingBar;
    Button btn_submit;//submit the value on next page


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_rating_bar);





        seekBar=findViewById(R.id.seekBar);
        tvData=(TextView)findViewById(R.id.tv_seekBar);
        btn_submit=findViewById(R.id.submit_next_page);

        ratingBar=findViewById(R.id.rationBar);
        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
        tvRatingBar=(TextView)findViewById(R.id.tv_ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                tvRatingBar.setText(String.valueOf(rating));
                rating_value=String.valueOf(rating);
            }
        });




        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvData.setText(String.valueOf(progress));
                seek_value=String.valueOf(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(seekBar_ratingBar.this,reetingBar_seekBar_Value.class);
                i.putExtra("KEY_RATING",rating_value);
                i.putExtra("KEY_SEEK",seek_value);
                startActivity(i);
            }
        });
    }
}