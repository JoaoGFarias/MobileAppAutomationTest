package com.mytaxi.android_demo.pageObjects;

import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.base.BaseScreen;
import com.mytaxi.android_demo.base.element.Element;

public class DriverScreen extends BaseScreen {

    public DriverScreen(ActivityTestRule<MainActivity> activityRule) {
        super(activityRule);
    }

    private Element getCallButton() { return getElementById(R.id.fab); }

    @Override
    public Boolean isOpen() {
        return getCallButton().isVisible();
    }

    public DriverScreen callDriver() {
        getCallButton().click();
        return this;
    }
}
