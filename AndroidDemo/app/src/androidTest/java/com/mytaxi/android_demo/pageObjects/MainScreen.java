package com.mytaxi.android_demo.pageObjects;

import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.base.BaseScreen;
import com.mytaxi.android_demo.base.Element;

public class MainScreen extends BaseScreen {

    public MainScreen(ActivityTestRule<MainActivity> activityRule) {
        super(activityRule);
    }

    protected Element getSearchInput() {
        return getElementById(R.id.textSearch);
    }

    public MainScreen searchFor(String searchText) {
        // TODO - Element base class
        this.getSearchInput().type(searchText);
        return this;
    }

    public DriverScreen selectDriverNamed(String driverName) {
        Element driverElement = getElementWithText(driverName);
        searchOnOtherWindows(driverElement).scrollTo().click();
        return new DriverScreen(this.getActivityRule());
    }
}
