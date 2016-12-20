package com.example.tnwls.my_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by LG on 2016-11-25.
 */


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.local :
                intent = new Intent(this, List_Local.class);
                startActivity(intent);
                break;

            case R.id.thema :
                intent = new Intent(this, List_Thema.class);
                startActivity(intent);
                break;

            case R.id.mypage :
                intent = new Intent(this, BookMark.class);
                startActivity(intent);
                break;
        }
    }

}
