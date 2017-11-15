package com.example.francatm0.codelabandroidlifecycle_awarecomponents.step5;

import android.arch.lifecycle.LifecycleActivity;
import android.os.Bundle;

import com.example.francatm0.codelabandroidlifecycle_awarecomponents.R;

/**
 * Shows two {@link Fragment_step5} fragments.
 */
public class Activity_step5 extends LifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_step5);
    }
}
