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

/*
*   테마별 메뉴로 들어왔을 때
* */

public class List_Thema_In extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayAdapter<String> Adapter;

    public String[] list = {
            "fest_thema_01",
            "fest_thema_02",
            "fest_thema_03",
            "fest_thema_04",
            "fest_thema_05"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema_in);
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list);

        ListView listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, Festival_In.class);
        startActivity(intent);
    }
}
