package com.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Spinner_browser extends AppCompatActivity {
    Spinner spinner;
    TextView spinner_txt;
    String strLang[]={"select an language","c","cpp","java","android","python","reactjs"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_browser);

        spinner=findViewById(R.id.spinner_spn);
        spinner_txt=findViewById(R.id.spinner_txt);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang){
            @NonNull
            @Override
            public View getView(int position, @Nullable View c, @NonNull ViewGroup p){
                TextView textView=(TextView) super.getView(position,c,p);
                textView.setTextColor(Color.GREEN);
                return textView;
            }
            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                TextView spinner_txt=(TextView) super.getDropDownView(position, convertView, parent);
                if(position==0){
                    spinner_txt.setBackgroundColor(Color.MAGENTA);
                }else{
                    spinner_txt.setTextColor(Color.rgb(200,0,0));
                }
                return spinner_txt;

            }
        };

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String strData=parent.getItemAtPosition(position).toString();
                if(strData.equals("select an language")){

                }else {
                    spinner_txt.setText("Selected language is " + strData);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}