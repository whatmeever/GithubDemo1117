package com.phone1000.githubdemo1117;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("test", "test");
        Log.d("test", "test2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test", "test start");
    }
}
