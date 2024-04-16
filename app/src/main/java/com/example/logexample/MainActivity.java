package com.example.logexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomLogger logger = new CustomLogger();
        logger.appendLog(getApplicationContext(), "test log message");
        logger.appendLog(getApplicationContext(), "test log message123");
        logger.appendLog(getApplicationContext(), "test log message45345");
        logger.appendLog(getApplicationContext(), "test log message325");
        logger.appendLog(getApplicationContext(), "test log message645");
        logger.appendLog(getApplicationContext(), "test log message324");


    }
}