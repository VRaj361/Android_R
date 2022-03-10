package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class customListView_browser extends AppCompatActivity {
    ListView listView;
    String strLang[]={"Python","Java","cpp","go lang","c","android"};
    int strLangImg[]={R.drawable.ic_python,R.drawable.ic_java,R.drawable.ic_c,R.drawable.ic_c,R.drawable.ic_house,R.mipmap.ic_launcher_round};
    ArrayList<LangModel> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_browser);
        listView=findViewById(R.id.customview_homebrowser);
        arr=new ArrayList<LangModel>();
        for(int i=0;i<strLang.length;i++){
            LangModel langModel=new LangModel(strLang[i],strLangImg[i]);
            arr.add(langModel);
        }
        MyBaseAdapter myBaseAdapter=new MyBaseAdapter(this,arr);
        listView.setAdapter(myBaseAdapter);

    }
}