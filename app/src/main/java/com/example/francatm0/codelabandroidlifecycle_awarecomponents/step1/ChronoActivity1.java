package com.example.francatm0.codelabandroidlifecycle_awarecomponents.step1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

import com.example.francatm0.codelabandroidlifecycle_awarecomponents.R;

public class ChronoActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);

        chronometer.start();
    }
}
