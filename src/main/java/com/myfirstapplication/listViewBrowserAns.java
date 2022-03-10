package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class listViewBrowserAns extends AppCompatActivity {
    TextView list_view_ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_browser_ans);
        list_view_ans=findViewById(R.id.list_view_ans);
        Intent intent=getIntent();
        String str=intent.getStringExtra("LISTDATA");
        list_view_ans.setText(str);

    }
}