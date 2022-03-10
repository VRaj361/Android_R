package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class gridViewBrowser extends AppCompatActivity {
    GridView grid_view;
    String strLang[]={"select an language","c","cpp","java","android","python","reactjs"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_browser);
        grid_view=findViewById(R.id.grid_view);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,strLang);
        grid_view.setAdapter(arrayAdapter);

    }
}