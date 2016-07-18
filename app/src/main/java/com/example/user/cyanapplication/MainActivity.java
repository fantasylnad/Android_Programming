package com.example.user.cyanapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.util.Log;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final static String DebugTag="MainActivity";
    @Override  //Override parent
    protected void onCreate(Bundle savedInstanceState) { //Constructor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.new_layout);
//        Log.d(DebugTag,"HAHAHA");
//        //Log.i(DebugTag,"hehehe");
//        Log.d(DebugTag,"WAWAWA");
//        Toast.makeText(this, "This is a test", Toast.LENGTH_LONG).show();
    }
}
