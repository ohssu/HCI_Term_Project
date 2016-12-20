package com.example.tnwls.my_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/*
*   축제버튼 눌렀을 때
* */
public class Festival_In extends AppCompatActivity {
   // ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival_in);

       /* pager = (ViewPager) findViewById(R.id.festival_in_pager);

        CustomAdapter adapter = new CustomAdapter(getLayoutInflater());
        pager.setAdapter(adapter);*/
    }

    public void onClick_Festival_menu(View v) {
        Intent intent_Festival_In_menu;
        switch (v.getId()) {
            case R.id.intro:
                intent_Festival_In_menu = new Intent(this, Festival_In_Introduce.class);
                startActivity(intent_Festival_In_menu);
                break;
            case R.id.guide:
                intent_Festival_In_menu = new Intent(this, Festival_In_OperationGuide.class);
                startActivity(intent_Festival_In_menu);
                break;
            case R.id.facility:
                intent_Festival_In_menu = new Intent(this, Festival_In_Facilities.class);
                startActivity(intent_Festival_In_menu);
                break;
        }
    }

    public void Bookmark(View v) {
        Intent intent2 = new Intent(getApplicationContext(), BookMark.class);
        Intent intent3 = getIntent();

        String title_name = intent3.getStringExtra("title");
        String example_name = intent3.getStringExtra("artist");
        int img = intent3.getIntExtra("img", 0);

        //int img = getResources().getIdentifier("com.example.lg.myapplication:drawable/"+str_t,null,null);
        intent2.putExtra("title", title_name);
        intent2.putExtra("example", example_name);
        intent2.putExtra("img", img);
        intent2.putExtra("bool", true);
        startActivity(intent2);
    }
}
