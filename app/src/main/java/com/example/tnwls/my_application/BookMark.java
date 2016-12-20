package com.example.tnwls.my_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by LG on 2016-11-25.
 */

public class BookMark extends Activity {
    ArrayList<Festival_In_INFO> bookmark = new ArrayList<Festival_In_INFO>();
    DBHelper dbHelper = new DBHelper(this,"bookmarklist.db",null,1);


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookmark);  // 즐겨찾기 xml 연결


        Intent intent = new Intent(this.getIntent());
        if(intent.getBooleanExtra("bool",true)){
            String title = intent.getStringExtra("title");
            String example = intent.getStringExtra("example");
            int img = intent.getIntExtra("img",0);

            dbHelper.insert(title,example,img);
        }

        bookmark = dbHelper.getResult();

        ListAdapter adapter = new ListAdapter(this, R.layout.row, bookmark);
        ListView list = (ListView)findViewById(R.id.listView2);
        list.setAdapter(adapter);





    }
}
