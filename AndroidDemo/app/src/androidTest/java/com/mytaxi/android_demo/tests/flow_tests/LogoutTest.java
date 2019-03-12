package com.mytaxi.android_demo.tests.flow_tests;

import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.base.BaseMainActivityTest;
import com.mytaxi.android_demo.pageObjects.AuthenticationScreen;
import com.mytaxi.android_demo.pageObjects.MainScreen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public final class LogoutTest extends BaseMainActivityTest {

    private MainScreen mainScreen;

    @Before
    public void logoutTestSetup() {
        this.mainScreen = new MainScreen(activityRule);
    }

    @Test
    public void checkLogout() {
        AuthenticationScreen logoutScreen = mainScreen.logout();

        Assert.assertFalse(mainScreen.isOpen());
        Assert.assertTrue(logoutScreen.isOpen());
    }
}
