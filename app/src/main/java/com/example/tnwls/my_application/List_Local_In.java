package com.example.tnwls.my_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.id.list;

/*
*   지역별 메뉴로 들어왔을 때
* */

public class List_Local_In extends AppCompatActivity {
    ArrayList<Festival_In_INFO> al = new ArrayList<Festival_In_INFO>();

    /*public String[] list = {
            "fest_local_01",
            "fest_local_02",
            "fest_local_03",
            "fest_local_04",
            "fest_local_05"
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_in);

        al.add(new Festival_In_INFO("꽃", R.drawable.img1, "플라워"));
        al.add(new Festival_In_INFO("노란꽃", R.drawable.img1, "플라워2"));
        al.add(new Festival_In_INFO("바다", R.drawable.img2, "배경"));
        al.add(new Festival_In_INFO("사막", R.drawable.img2, "배경2"));

        ListAdapter adapter = new ListAdapter(getApplicationContext(), R.layout.row, al);

        ListView listVew = (ListView) findViewById(R.id.listView);
        listVew.setAdapter(adapter);

        listVew.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), Festival_In.class);
                intent.putExtra("title", al.get(position).title);
                intent.putExtra("img", al.get(position).img);
                intent.putExtra("artist", al.get(position).artist);
                startActivity(intent);

            }
        });
    }
}