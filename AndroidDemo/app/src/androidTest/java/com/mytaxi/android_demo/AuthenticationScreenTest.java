package com.mytaxi.android_demo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.AuthenticatedActivity;
import com.mytaxi.android_demo.activities.AuthenticationActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Test class to validate the UI and behavior of the Authetication screen
 */
@RunWith(AndroidJUnit4.class)
public class AuthenticationScreenTest {

    @Rule
    public ActivityTestRule<AuthenticatedActivity> authenticationScreen = new ActivityTestRule(AuthenticationActivity.class);

    private final Context appContext = InstrumentationRegistry.getTargetContext();

    @Test
    public void checkLoginButtonText(){
        String expectedLoginButtonText = appContext.getString(R.string.button_login);
        ViewInteraction loginButton = onView(withId(R.id.btn_login));
        loginButton.check(matches(withText(expectedLoginButtonText)));
    }

    @Test
    public void checkUsernameButtonText(){
        ViewInteraction usernameInput = onView(withId(R.id.edt_username));
        inputValueAndCheckText(usernameInput, "crazydog335");
    }

    @Test
    public void checkPasswordButtonText(){
        ViewInteraction passwordInput = onView(withId(R.id.edt_password));
        inputValueAndCheckText(passwordInput, "123456");
    }

    private ViewInteraction inputValueAndCheckText(ViewInteraction input, String text) {
        input.perform(typeText(text));
        input.check(matches(withText(text)));
        return input;
    }
}
