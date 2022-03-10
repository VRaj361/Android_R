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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewBasic extends AppCompatActivity {
    String strData[]={"JAva","cpp","c","python","ruby","javascript","fortan","html","css","angular","react","node","react native","android","flutter","jquey","ios"};
    ListView list_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basic);
        list_view=findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strData){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                TextView list_txt=(TextView) super.getView(position, convertView, parent);
                if(position%2==0){
                    list_txt.setBackgroundColor(Color.GRAY);
                    list_txt.setTextColor(Color.RED);
                }else{

                }
                return list_txt;
            }
        };//for the text list to change the color
        list_view.setAdapter(arrayAdapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String strData=parent.getItemAtPosition(position).toString();

                Intent intent=new Intent(ListViewBasic.this,listViewBrowserAns.class);
                intent.putExtra("LISTDATA",strData);
                startActivity(intent);

                Toast.makeText(ListViewBasic.this, strData, Toast.LENGTH_SHORT).show();
            }

        });

    }
}