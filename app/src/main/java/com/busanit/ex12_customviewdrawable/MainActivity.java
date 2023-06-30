package com.busanit.ex12_customviewdrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        CustomDrawable view = new CustomDrawable(this);
        setContentView(view);
    }
}