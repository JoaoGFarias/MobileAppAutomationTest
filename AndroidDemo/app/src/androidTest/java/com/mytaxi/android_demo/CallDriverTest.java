package com.mytaxi.android_demo;

import android.support.test.espresso.contrib.AccessibilityChecks;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.baseTests.AuthenticationActivityTest;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;

/**
 * Test class to validate myTaxi demo login process
 */
@RunWith(AndroidJUnit4.class)
public class CallDriverTest extends AuthenticationActivityTest {

    private final String username = "crazydog335";
    private final String password = "venture";

    @BeforeClass
    public static void enableAccessibilityChecks() {
        AccessibilityChecks.enable().setThrowExceptionForErrors(false);
    }

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);

    @Test
    public void checkCallDriverFlow() {
        this.getUsernameInput().perform(typeText(username));
        this.getPasswordInput().perform(typeText(password));
        login();

        this.getSearchInput().perform(typeText("sa"));

        this.selectDriverNamed("Sarah Scott", activityRule);

        this.callDriver();

        // TODO - Stub ACTION_DIAL Intent
    }

    private void login() {
        this.getLoginButton().perform(click());

        // TODO - To be replaced with IdlingResource
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.getUsernameInput().check(doesNotExist());
    }
}
