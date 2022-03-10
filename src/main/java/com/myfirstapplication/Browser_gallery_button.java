package com.myfirstapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Browser_gallery_button extends AppCompatActivity {
    Button btn_browser,btn_upload,btn_camara,btn_image,btn_rating_seek,alert_btn,custom_btn,submit_custom,custom_toast,date_btn,spinner_btn,spinnerList_btn,spinnergrid_btn,list_grid_btn,webview_btn,videoview_btn,customlistview_btn,custom_grid_view_btn;
    TextView email_custom;
    ImageView img_red;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_gallery_button);


        btn_browser=findViewById(R.id.browser_btn);
        btn_upload=findViewById(R.id.upload_btn);
        img_red=findViewById(R.id.img_redirect);
        btn_camara=findViewById(R.id.camara_btn);
        btn_image=findViewById(R.id.image_btn);
        btn_rating_seek=findViewById(R.id.seek_rating_bar);
        alert_btn=findViewById(R.id.alert_btn);
        date_btn=findViewById(R.id.date_btn);
        spinner_btn=findViewById(R.id.spinner_btn);
        spinnerList_btn=findViewById(R.id.spinnerList_btn);
        spinnergrid_btn=findViewById(R.id.spinnergrid_btn);
        list_grid_btn=findViewById(R.id.list_grid_btn);
        webview_btn=findViewById(R.id.webview_btn);
        videoview_btn=findViewById(R.id.videoview_btn);
        customlistview_btn=findViewById(R.id.customlistview_btn);
        custom_grid_view_btn=findViewById(R.id.custom_grid_view_btn);
        custom_grid_view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Browser_gallery_button.this,custom_gridView_browser.class);
                startActivity(intent);
            }
        });
        customlistview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Browser_gallery_button.this,customListView_browser.class);
                startActivity(intent);
            }
        });
        videoview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Browser_gallery_button.this,viewvideo_browser.class);
                startActivity(intent);
            }
        });
        webview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Browser_gallery_button.this,webView_browser.class);
                startActivity(intent);
            }
        });
        list_grid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Browser_gallery_button.this,listGridView.class);
                startActivity(intent);
            }
        });
        spinnergrid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Browser_gallery_button.this,gridViewBrowser.class);
                startActivity(intent);
            }
        });
        spinnerList_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Browser_gallery_button.this,ListViewBasic.class);
                startActivity(intent);
            }
        });
        spinner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Browser_gallery_button.this,Spinner_browser.class);
                startActivity(i);
            }
        });

        date_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Browser_gallery_button.this,DateTimepicker_browser.class);
                startActivity(i);
            }
        });
        custom_btn=findViewById(R.id.custom_btn);
        custom_toast=findViewById(R.id.custom_toast);

        custom_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View view=layoutInflater.inflate(R.layout.toast_browser,null);
                TextView text = (TextView) view.findViewById(R.id.text_cutom_toast);
                if(email!=null) {
                    text.setText(email);
                }
                Toast toast=new Toast(Browser_gallery_button.this);
//                toast.setText(email);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(view);
                toast.show();

            }
        });



        custom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View view=layoutInflater.inflate(R.layout.custom_layout,null);

                submit_custom=view.findViewById(R.id.submit_custom);
                email_custom=view.findViewById(R.id.email_custom);
                AlertDialog.Builder builder=new AlertDialog.Builder(Browser_gallery_button.this);
                AlertDialog alertDialog=builder.create();
                alertDialog.setView(view);

                submit_custom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(alertDialog.isShowing()){
                            alertDialog.dismiss();
                        }
                        email=email_custom.getText().toString();
                        Toast.makeText(Browser_gallery_button.this, email, Toast.LENGTH_SHORT).show();


                    }
                });

                alertDialog.show();

            }

        });




        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_PICK);
                i.setType("image/*");//set type is take image and take mime all
                startActivityForResult(i,111);
            }
        });

        btn_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_red.setImageResource(R.drawable.bg_home_ig);//for select particular image in the drawable folder
            }
        });

        btn_camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);//for capture the image and allow the turm and condition of capture image
                startActivityForResult(i,12);
            }
        });





        btn_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http:www.google.com/"));
                startActivity(i);
            }
        });


        btn_rating_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Browser_gallery_button.this,seekBar_ratingBar.class);
                startActivity(i);

            }
        });





    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==111 && resultCode==RESULT_OK){
            Uri uri=data.getData();
            img_red.setImageURI(uri);
        }
        //check the request code
        if(requestCode==12 && resultCode==RESULT_OK){
            Bitmap btmap=(Bitmap)data.getExtras().get("data");
            img_red.setImageBitmap(btmap);
        }
    }


    public void alert_btn(View view) {
        AlertDialog.Builder build=new AlertDialog.Builder(this);
//        because it is one override file
        build.setIcon(R.drawable.bg_home_ig);
        build.setTitle(getResources().getString(R.string.app_name));
        build.setMessage("Please Click the button");
        build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Browser_gallery_button.this,"Yes is clicked",Toast.LENGTH_SHORT).show();
            }
        });


        build.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Browser_gallery_button.this,"no is clicked",Toast.LENGTH_SHORT).show();
            }
        });
        build.setNeutralButton("Finish", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        build.show();


    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        AlertDialog.Builder build=new AlertDialog.Builder(this);
//        because it is one override file
        build.setIcon(R.drawable.bg_home_ig);
        build.setTitle(getResources().getString(R.string.app_name));
        build.setMessage("Please Click the name");
        build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        build.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Browser_gallery_button.this,"no is clicked",Toast.LENGTH_SHORT).show();
            }
        });
        build.show();
    }



}