package com.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listGridView extends AppCompatActivity {
    GridView grid_list_view;
    String strLang[]={"select an language","c","cpp","java","android","python","reactjs"};
    ListView list_grid_view;
    Button btn_change_list_grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_grid_view);
        list_grid_view=findViewById(R.id.list_grid_view);
        grid_list_view=findViewById(R.id.grid_list_view);
        btn_change_list_grid=findViewById(R.id.btn_change_list_grid);

        //grid view
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,strLang);
        grid_list_view.setAdapter(arrayAdapter);

        //list view
        list_grid_view.setAdapter(arrayAdapter);
        grid_list_view.setVisibility(View.GONE);


        //button event
        btn_change_list_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid_list_view.isShown()){
                    grid_list_view.setVisibility(View.GONE);
                    list_grid_view.setVisibility(View.VISIBLE);
                }else{
                    grid_list_view.setVisibility(View.VISIBLE);
                    list_grid_view.setVisibility(View.GONE);
                }
            }
        });




    }
}