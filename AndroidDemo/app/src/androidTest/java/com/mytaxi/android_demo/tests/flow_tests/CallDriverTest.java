package com.mytaxi.android_demo.tests.flow_tests;

import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.tests.utils.LoginCredentials;
import com.mytaxi.android_demo.base.BaseMainActivityTest;
import com.mytaxi.android_demo.pageObjects.AuthenticationScreen;
import com.mytaxi.android_demo.pageObjects.DriverScreen;
import com.mytaxi.android_demo.pageObjects.MainScreen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test class to validate myTaxi driver calling flows
 */
@RunWith(AndroidJUnit4.class)
public final class CallDriverTest extends BaseMainActivityTest {

    private AuthenticationScreen authenticationScreen;

    @Before
    public void callDriverTestSetup() {
        this.authenticationScreen = new AuthenticationScreen(activityRule);
    }

    @Test
    public void checkCallDriverFlow() {
        MainScreen mainScreen = this.authenticationScreen.login(
                LoginCredentials.getUsername(), LoginCredentials.getPassword());

        DriverScreen driverscreen = mainScreen.searchFor("sa").selectDriverNamed("Sarah Scott");

        driverscreen.callDriver();

        // TODO - Stub ACTION_DIAL Intent
    }
}
