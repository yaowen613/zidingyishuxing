package com.yaowen.zidingyishuxing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyTextView textView= (MyTextView) findViewById(R.id.mytextView);
        String str=textView.getText().toString();
        Log.d("this", "str==" + str);
    }
}
