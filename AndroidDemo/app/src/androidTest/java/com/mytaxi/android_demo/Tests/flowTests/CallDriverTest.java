package com.mytaxi.android_demo.Tests.flowTests;

import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.base.BaseMainActivityTest;
import com.mytaxi.android_demo.pageObjects.AuthenticationScreen;
import com.mytaxi.android_demo.pageObjects.DriverScreen;
import com.mytaxi.android_demo.pageObjects.MainScreen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test class to validate myTaxi driver calling flow
 */
@RunWith(AndroidJUnit4.class)
public class CallDriverTest extends BaseMainActivityTest {

    private final String username = "crazydog335";
    private final String password = "venture";
    private AuthenticationScreen authenticationScreen;

    @Before
    public void callDriverTestSetup() {
        this.authenticationScreen = new AuthenticationScreen(activityRule);
    }

    @Test
    public void checkCallDriverFlow() {

        MainScreen mainScreen = this.authenticationScreen.login(username, password);

        DriverScreen driverscreen = mainScreen.searchFor("sa").selectDriverNamed("Sarah Scott");

        driverscreen.callDriver();

        // TODO - Stub ACTION_DIAL Intent
    }
}
