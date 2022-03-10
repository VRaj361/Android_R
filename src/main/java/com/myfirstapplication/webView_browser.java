package com.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class webView_browser extends AppCompatActivity {
    WebView webview_sho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_browser);
        webview_sho=findViewById(R.id.webview_show);
        webview_sho.getSettings().setJavaScriptEnabled(true);
        webview_sho.getSettings().setLoadsImagesAutomatically(true);
        webview_sho.loadUrl("https://www.javatpoint.com/");
        webview_sho.setWebViewClient(new MyWebview());


    }

    private class MyWebview extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if(webview_sho.canGoBack()){
            webview_sho.goBack();
        }else{
            AlertDialog.Builder build=new AlertDialog.Builder(this);
            build.setTitle(getResources().getString(R.string.app_name));
            build.setMessage("Are you sure to leave?");
            build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            build.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(webView_browser.this,"no is clicked",Toast.LENGTH_SHORT).show();
                }
            });
            build.show();

//            finish();//for going to home page or exit
        }
    }

}