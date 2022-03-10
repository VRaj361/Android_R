package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fragment_whatsapp_three extends AppCompatActivity {
    Button btn_call,btn_status,btn_chats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_whatsapp_three);
        btn_call=findViewById(R.id.btn_call);
        View call=findViewById(R.id.btn_call_line);
        View status=findViewById(R.id.btn_status_line);
        View chat=findViewById(R.id.btn_chat_line);
//                call.setVisibility(View.VISIBLE);
//                status.setVisibility(View.GONE);
//                chat.setVisibility(View.GONE);
        status.setBackgroundResource(R.color.white);
        chat.setBackgroundResource(R.color.white);
        call.setBackgroundResource(R.color.white);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View call=findViewById(R.id.btn_call_line);
                View status=findViewById(R.id.btn_status_line);
                View chat=findViewById(R.id.btn_chat_line);
//                call.setVisibility(View.VISIBLE);
//                status.setVisibility(View.GONE);
//                chat.setVisibility(View.GONE);
                status.setBackgroundResource(R.color.white);
                chat.setBackgroundResource(R.color.white);
                call.setBackgroundResource(R.color.black);

                fragment1_basic1 fra1=new fragment1_basic1();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_what,fra1);
                fragmentTransaction.commit();

            }
        });
        btn_status=findViewById(R.id.btn_status);
        btn_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View call=findViewById(R.id.btn_call_line);
                View status=findViewById(R.id.btn_status_line);
                View chat=findViewById(R.id.btn_chat_line);
//                call.setVisibility(View.GONE);
//                status.setVisibility(View.VISIBLE);
//                chat.setVisibility(View.GONE);
                call.setBackgroundResource(R.color.white);
                chat.setBackgroundResource(R.color.white);
                status.setBackgroundResource(R.color.black);

                fragment2_basic2 fra2=new fragment2_basic2();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_what,fra2);
                fragmentTransaction.commit();
            }
        });
        btn_chats=findViewById(R.id.btn_chat);
        btn_chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View call=findViewById(R.id.btn_call_line);
                View status=findViewById(R.id.btn_status_line);
                View chat=findViewById(R.id.btn_chat_line);
//                call.setVisibility(View.GONE);
//                status.setVisibility(View.GONE);
//                chat.setVisibility(View.VISIBLE);
                status.setBackgroundResource(R.color.white);
                call.setBackgroundResource(R.color.white);
                chat.setBackgroundResource(R.color.black);
                fragment3_basic3 fra3=new fragment3_basic3();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_what,fra3);
                fragmentTransaction.commit();
            }
        });

    }
}