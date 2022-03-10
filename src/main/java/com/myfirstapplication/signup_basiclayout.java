package com.myfirstapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class signup_basiclayout extends AppCompatActivity {
    EditText edtFirstName1;
//    EditText edtMiddleName;
//    EditText edtLastName;
    EditText edtEmail1;
    EditText edtPassw;
    Button login_btn1;
    ImageView camera,gallery,cam,imgSet;
    CircleImageView design_upperid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_basiclayout);
        edtFirstName1=findViewById(R.id.inner_name);
        edtEmail1=findViewById(R.id.inner_email);
        edtPassw=findViewById(R.id.inner_pass);
        login_btn1=findViewById(R.id.btn_signup);
        imgSet=findViewById(R.id.img_set);


        design_upperid = findViewById(R.id.design_upperid);
        login_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = edtPassw.getText().toString();
                String emailId=edtEmail1.getText().toString();
                String name= edtFirstName1.getText().toString();
                Intent i_signup=new Intent(signup_basiclayout.this,signup_redirect.class);
                Toast.makeText(signup_basiclayout.this, "Email is here", Toast.LENGTH_SHORT).show();
                i_signup.putExtra("KEY_EMAIL",emailId);
                i_signup.putExtra("KEY_NAME",name);
                i_signup.putExtra("KEY_PASS",pass);
                startActivity(i_signup);
            }
        });

        imgSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View view=layoutInflater.inflate(R.layout.chooseimage,null);
                cam=view.findViewById(R.id.camera_img);
                gallery=view.findViewById(R.id.gallery_img);

                AlertDialog.Builder builder=new AlertDialog.Builder(signup_basiclayout.this);
                AlertDialog alertDialog=builder.create();
                alertDialog.setView(view);
alertDialog.show();
                cam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(alertDialog.isShowing()){
                            alertDialog.dismiss();
                        }
                        Intent i=new Intent();
                        i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);//for capture the image and allow the turm and condition of capture image
                        startActivityForResult(i,2);
                    }
                });
                gallery.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(alertDialog.isShowing()){
                            alertDialog.dismiss();
                        }
                        Intent i = new Intent();
                        i.setAction(Intent.ACTION_PICK);
                        i.setType("image/*");//set type is take image and take mime all
                        startActivityForResult(i,1);
                    }
                });





            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 ){
            Uri uri=data.getData();
            design_upperid.setImageURI(uri);
        }
        //check the request code
        if(requestCode==2 ){
            Bitmap btmap=(Bitmap)data.getExtras().get("data");
            design_upperid.setImageBitmap(btmap);
        }
    }
}