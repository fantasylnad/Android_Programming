package com.example.user.mypokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView info;
    EditText name;
    RadioGroup options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        options = (RadioGroup) findViewById(R.id.radioGroup);
        info = (TextView) findViewById(R.id.textView);
        name = (EditText)  findViewById(R.id.Name);

        MyOnClickListener submitListener = new MyOnClickListener();
        Button submit= (Button)findViewById(R.id.submit);
        submit.setOnClickListener(submitListener);
    }

    private static class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            switch (viewId){
                case R.id.submit:
                    // get pokemon
//                    if (name != ""){
//                        info.setText("你好, "+name);
//                    }
                    break;
            }
        }
    }

}
