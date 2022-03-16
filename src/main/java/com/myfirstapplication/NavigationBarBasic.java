package com.myfirstapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.myfirstapplication.databinding.ActivityNavigationBarBasicBinding;

public class NavigationBarBasic extends AppCompatActivity {
    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_bar_basic);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.nav_home){
                    Toast.makeText(NavigationBarBasic.this, "Home", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Home");
                }else if(id==R.id.nav_gallery){
                    Toast.makeText(NavigationBarBasic.this, "Gallery", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Gallery");
                }else if(id==R.id.nav_slideshow){
                    Toast.makeText(NavigationBarBasic.this, "Slideshow", Toast.LENGTH_SHORT).show();
                    toolbar.setTitle("Slideshow");
                }
                drawerLayout.closeDrawer(GravityCompat.START);



                return true;
            }
        });



    }
}