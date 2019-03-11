package com.mytaxi.android_demo.pageObjects;

import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.base.BaseScreen;

import static android.support.test.espresso.action.ViewActions.click;

public class DriverScreen extends BaseScreen {
    public DriverScreen(ActivityTestRule<MainActivity> activityRule) {
        super(activityRule);
    }

    public DriverScreen callDriver() {
        getElementById(R.id.fab).perform(click());
        return this;
    }
}
