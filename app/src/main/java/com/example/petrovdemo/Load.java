package com.example.petrovdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Load extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        Timer t  = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(Load.this, SignIn.class);
                startActivity(i);
                finish();
            }
        };
        t.schedule(task, 2000L);


    }
}