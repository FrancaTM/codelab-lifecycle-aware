package com.example.francatm0.codelabandroidlifecycle_awarecomponents.step2;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

/**
 * A ViewModel used for the {@link ChronoActivity2}.
 */
public class ChronometerViewModel extends ViewModel {

    @Nullable
    private Long startDate;

    @Nullable
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(final long startDate) {
        this.startDate = startDate;
    }
}
