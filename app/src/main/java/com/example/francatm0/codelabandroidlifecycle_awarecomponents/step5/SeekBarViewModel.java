package com.example.francatm0.codelabandroidlifecycle_awarecomponents.step5;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * A ViewModel used in step 5.
 */
public class SeekBarViewModel extends ViewModel {

    public MutableLiveData<Integer> seekbarValue = new MutableLiveData<>();
}
