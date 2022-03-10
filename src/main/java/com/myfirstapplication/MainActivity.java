package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText edtEmail;
     EditText edtPass;
     Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail=findViewById(R.id.edt_email);
        edtPass=findViewById(R.id.pass_password);
        btnLogin=findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String pass = edtPass.getText().toString();
                String emailId=edtEmail.getText().toString();
//                if(emailId.equals("")&&pass.equals("")){
////                    Toast.makeText(MainActivity.this, "Please enter email", Toast.LENGTH_SHORT).show();
//                    edtEmail.setError("Please enter emailId");
//                    edtPass.setError("Please Enter Password");
//
//                }else {
//                    Toast.makeText(MainActivity.this, "Email-Id is " + emailId + "Password is " + pass, Toast.LENGTH_SHORT).show();
//                }
                Intent i_email=new Intent(MainActivity.this,MainActivity_redirect.class);
                i_email.putExtra("KEY_EMAIL",emailId);
                startActivity(i_email);
            }
        });

    }
}