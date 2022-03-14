package com.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdpter extends FragmentPagerAdapter {
    int tabCount;

    public MyPagerAdpter(FragmentManager supportFragmentManager,int tabCount) {
        super(supportFragmentManager);
        this.tabCount=tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ChatWhatsappFragment chatWhatsappFragment=new ChatWhatsappFragment();
                return chatWhatsappFragment;



            case 1:
                StatusWhatsapp statusWhatsapp=new StatusWhatsapp();
                return statusWhatsapp;

            case 2:
                CallWhatsapp callWhatsapp=new CallWhatsapp();
                return callWhatsapp;
        }
        return  null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
