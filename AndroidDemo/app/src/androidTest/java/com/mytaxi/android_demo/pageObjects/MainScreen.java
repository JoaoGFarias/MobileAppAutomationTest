package com.mytaxi.android_demo.pageObjects;

import android.support.test.rule.ActivityTestRule;
import android.view.Gravity;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.base.BaseScreen;
import com.mytaxi.android_demo.base.element.Element;

public class MainScreen extends BaseScreen {

    public MainScreen(ActivityTestRule<MainActivity> activityRule) {
        super(activityRule);
    }

    private Element getSearchInput() {
        return getElementById(R.id.textSearch);
    }

    public MainScreen searchFor(String searchText) {
        this.getSearchInput().type(searchText);
        return this;
    }

    public DriverScreen selectDriverNamed(String driverName) {
        Element driverElement = getElementWithText(driverName);
        searchOnOtherWindows(driverElement).scrollTo().click();
        return new DriverScreen(this.getActivityRule());
    }

    public AuthenticationScreen logout() {
        openDrawer();
        navigateToLogout();
        waitLogoutProcess();

        return new AuthenticationScreen(getActivityRule());
    }

    private void navigateToLogout() {
        getNavigationById(R.id.nav_view).navigateTo(R.id.nav_logout);
    }

    private void openDrawer() {
        getDrawerById(R.id.drawer_layout)
                .checkIsClosed(Gravity.LEFT)
                .open();
    }

    private void waitLogoutProcess() {
        // TODO - To be replaced with IdlingResource
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Boolean isOpen() {
        return this.getSearchInput().isVisible();
    }
}
