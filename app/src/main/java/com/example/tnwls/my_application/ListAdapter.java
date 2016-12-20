package com.example.tnwls.my_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LG on 2016-11-25.
 */

class ListAdapter extends BaseAdapter {
    ArrayList<Festival_In_INFO> marklist;
    Context context;
    int layout;
    ArrayList<Festival_In_INFO> al;
    LayoutInflater inf;

    public ListAdapter(Context context, int layout, ArrayList<Festival_In_INFO> al) {
        this.context = context;
        this.layout = layout;
        this.al = al;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return al.size();
    }

    public Object getItem(int position) {
        return al.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView tvName = (TextView)convertView.findViewById(R.id.textView1);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.textView2);

        Festival_In_INFO m = al.get(position);
        iv.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.artist);

        return convertView;

    }

    public ArrayList<Festival_In_INFO> addItem(Festival_In_INFO song) {
        marklist.add(song);
        return marklist;
    }

}
