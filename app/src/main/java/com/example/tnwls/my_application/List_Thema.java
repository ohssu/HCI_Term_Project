package com.example.tnwls.my_application;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by tnwls on 2016-10-10.
 */
public class List_Thema extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema);
    }

    //intent에 넘어갈 엑티비티클래스
    public void onClick0(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //finish();
    }

    public void onClick_thema(View v) {
        Intent intent = new Intent(this, List_Thema_In.class);
        startActivity(intent);
        //finish();
    }

}
