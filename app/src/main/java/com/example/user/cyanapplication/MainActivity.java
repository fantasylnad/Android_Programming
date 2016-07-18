package com.example.user.cyanapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override  //Override parent
    protected void onCreate(Bundle savedInstanceState) { //Constructor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.new_layout);
    }
}
