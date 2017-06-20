package com.tang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.tang.craftkit.log.Logger;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d("MainActivity onCreate");
    }
}
