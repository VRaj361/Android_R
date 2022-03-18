package com.myfirstapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class fragment1_basic1 extends Fragment {
    ListView listView;
    String strLang[]={"Python","Java","cpp","go lang","c","android"};
    int strLangImg[]={R.drawable.ic_python,R.drawable.ic_java,R.drawable.ic_c,R.drawable.ic_c,R.drawable.ic_house,R.mipmap.ic_launcher_round};
    ArrayList<LangModel> arr;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment1_basic,container,false);

        listView=rootview.findViewById(R.id.list_view_list);
        arr=new ArrayList<LangModel>();
        for(int i=0;i<strLang.length;i++){
            LangModel langModel=new LangModel(strLang[i],strLangImg[i]);
            arr.add(langModel);
        }
        MyBaseAdapter myBaseAdapter=new MyBaseAdapter(getContext(),arr);
        listView.setAdapter(myBaseAdapter);
        return rootview;
    }
}