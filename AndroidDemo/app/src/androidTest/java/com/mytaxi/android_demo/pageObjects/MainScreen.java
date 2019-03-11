package com.mytaxi.android_demo.pageObjects;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.base.BaseScreen;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;

public class MainScreen extends BaseScreen {

    public MainScreen(ActivityTestRule<MainActivity> activityRule) {
        super(activityRule);
    }

    protected ViewInteraction getSearchInput() {
        return getElementById(R.id.textSearch);
    }

    public MainScreen searchFor(String searchText) {
        // TODO - Element base class
        this.getSearchInput().perform(typeText(searchText));
        return this;
    }

    public DriverScreen selectDriverNamed(String driverName) {
        ViewInteraction driverElement = getElementWithText(driverName);
        searchOnOtherWindows(driverElement).perform(scrollTo(), click());
        return new DriverScreen(this.getActivityRule());
    }
}
