package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class custom_gridView_browser extends AppCompatActivity {
    GridView custom_grid_view;
    String strLang[]={"Python","Java","cpp","go lang","c","android"};
    int strLangImg[]={R.drawable.ic_python,R.drawable.ic_java,R.drawable.ic_c,R.drawable.ic_c,R.drawable.ic_house,R.mipmap.ic_launcher_round};
    ArrayList<LangModel> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view_browser);
        custom_grid_view=findViewById(R.id.custom_grid_view);
        arr=new ArrayList<LangModel>();
        for(int i=0;i<strLang.length;i++){
            LangModel langModel=new LangModel(strLang[i],strLangImg[i]);
            arr.add(langModel);
        }
        MyBaseAdapter1 myBaseAdapter=new MyBaseAdapter1(this,arr);
        custom_grid_view.setAdapter(myBaseAdapter);
        custom_grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String strData=arr.get(position).getStr();
                int img=arr.get(position).getStrLangImg();

                Intent intent=new Intent(custom_gridView_browser.this,data_custom_grid_view.class);
                intent.putExtra("GRIDTXTDATA",strData);
                intent.putExtra("GRIDIMGDATA",img);
                startActivity(intent);

                Toast.makeText(custom_gridView_browser.this, strData, Toast.LENGTH_SHORT).show();
            }

        });
    }
}