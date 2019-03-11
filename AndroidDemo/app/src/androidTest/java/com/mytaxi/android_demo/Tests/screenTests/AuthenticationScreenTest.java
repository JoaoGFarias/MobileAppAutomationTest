package com.mytaxi.android_demo.Tests.screenTests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.AuthenticationActivity;
import com.mytaxi.android_demo.base.BaseTest;
import com.mytaxi.android_demo.base.element.Element;
import com.mytaxi.android_demo.pageObjects.AuthenticationScreen;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Test class to validate the UI and behavior of the Authentication screen
 */
@RunWith(AndroidJUnit4.class)
public final class AuthenticationScreenTest extends BaseTest {

    private AuthenticationScreen authenticationScreen;

    @Rule
    public ActivityTestRule activityRule = new ActivityTestRule(AuthenticationActivity.class);

    @Before
    public void authenticationTestSetup() {
        this.authenticationScreen = new AuthenticationScreen(activityRule);
    }

    @Test
    public void checkLoginButtonText() {
        String expectedLoginButtonText = appContext.getString(R.string.button_login);
        Element loginButton = authenticationScreen.getLoginButton();
        loginButton.check(matches(withText(expectedLoginButtonText)));
    }

    @Test
    public void checkUsernameButtonText() {
        Element usernameInput = authenticationScreen.getUsernameInput();
        inputValueAndCheckText(usernameInput, "crazydog335");
    }

    @Test
    public void checkPasswordButtonText() {
        Element passwordInput = authenticationScreen.getPasswordInput();
        inputValueAndCheckText(passwordInput, "123456");
    }

    private Element inputValueAndCheckText(Element input, String text) {
        input.type(text);
        input.check(matches(withText(text)));
        return input;
    }
}
