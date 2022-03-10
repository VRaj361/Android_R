package com.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottonActivityCustomr extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botton_customr);
        bottomNavigationView=findViewById(R.id.bottom_view);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.item_home){
                    Toast.makeText(BottonActivityCustomr.this, "Home", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Home");
                }else if(id==R.id.item_edit){
                    Toast.makeText(BottonActivityCustomr.this, "Edit",  Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Edit");
                }else if(id==R.id.item_add){
                    Toast.makeText(BottonActivityCustomr.this, "Add", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Add");
                }else{
                    Toast.makeText(BottonActivityCustomr.this, "Options", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Option");
                }
                return true;
            }
        });
    }
}