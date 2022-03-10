package com.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_option_context_menu extends AppCompatActivity {

    TextView textView;
    Button popup_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_context_menu);
        textView=findViewById(R.id.find_menu_text_view);
        registerForContextMenu(textView);
        popup_menu=findViewById(R.id.popup_menu);
        popup_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(Activity_option_context_menu.this,popup_menu);
                MenuInflater menuInflater=getMenuInflater();
                menuInflater.inflate(R.menu.item_menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.item_add:
                                Toast.makeText(Activity_option_context_menu.this, "Add", Toast.LENGTH_SHORT).show();
                            case R.id.item_option:
                                Toast.makeText(Activity_option_context_menu.this, "Option", Toast.LENGTH_SHORT).show();
                            case R.id.item_edit:
                                Toast.makeText(Activity_option_context_menu.this, "Edit", Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.item_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_add:
                Toast.makeText(Activity_option_context_menu.this, "Add", Toast.LENGTH_SHORT).show();
            case R.id.item_option:
                Toast.makeText(Activity_option_context_menu.this, "Option", Toast.LENGTH_SHORT).show();
            case R.id.item_edit:
                Toast.makeText(Activity_option_context_menu.this, "Edit", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.item_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_add:
                Toast.makeText(Activity_option_context_menu.this, "Add", Toast.LENGTH_SHORT).show();
            case R.id.item_option:
                Toast.makeText(Activity_option_context_menu.this, "Option", Toast.LENGTH_SHORT).show();
            case R.id.item_edit:
                Toast.makeText(Activity_option_context_menu.this, "Edit", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}