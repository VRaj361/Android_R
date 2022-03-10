package com.myfirstapplication;

import android.content.Context;
import android.transition.CircularPropagation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<LangModel> arr;
    public MyBaseAdapter(Context context, ArrayList<LangModel> arr) {
        this.context=context;
        this.arr=arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return arr.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(R.layout.row_custom_list, null);
        CircleImageView circleImageView=view.findViewById(R.id.img_data);
        TextView textView=view.findViewById(R.id.browser_data);
        LangModel langModel=arr.get(i);
        circleImageView.setImageResource(arr.get(i).getStrLangImg());
        textView.setText(langModel.getStr());
        return view;
    }
}