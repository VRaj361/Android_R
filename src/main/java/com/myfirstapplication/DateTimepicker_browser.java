package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class DateTimepicker_browser extends AppCompatActivity {

    TextView bro_text,bro_time;
    Button btnDate,btnTime;
    private int date,year,month,hour,minute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_timepicker_browser);
        btnDate=findViewById(R.id.btn_date);
        bro_text=findViewById(R.id.bro_date);

        bro_time=findViewById(R.id.bro_time);
        btnTime=findViewById(R.id.btn_time);


        Calendar calendar=Calendar.getInstance();
        date=calendar.get(Calendar.DAY_OF_MONTH);
        month=calendar.get(Calendar.MONTH);
        year=calendar.get(Calendar.YEAR);
        hour=calendar.get(Calendar.HOUR_OF_DAY);
        minute=calendar.get(Calendar.MINUTE);



        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(DateTimepicker_browser.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        bro_text.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,date);
                datePickerDialog.show();
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog=new TimePickerDialog(DateTimepicker_browser.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        bro_time.setText(hourOfDay+":"+minute);
                    }
                },hour,minute,true);
                timePickerDialog.show();
            }
        });





    }
}