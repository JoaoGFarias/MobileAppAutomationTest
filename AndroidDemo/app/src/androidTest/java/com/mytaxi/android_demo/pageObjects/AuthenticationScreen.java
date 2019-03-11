package com.mytaxi.android_demo.pageObjects;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.base.BaseScreen;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;

public class AuthenticationScreen extends BaseScreen {


    public AuthenticationScreen(ActivityTestRule activityRule) {
        super(activityRule);
    }

    public ViewInteraction getLoginButton() {
        return getElementById(R.id.btn_login);
    }

    public ViewInteraction getUsernameInput() {
        return getElementById(R.id.edt_username);
    }

    public ViewInteraction getPasswordInput() {
        return getElementById(R.id.edt_password);
    }


    public MainScreen login(String username, String password) {
        this.getUsernameInput().perform(typeText(username));
        this.getPasswordInput().perform(typeText(password));
        this.getLoginButton().perform(click());
        waitLoginProcess();

        return new MainScreen(this.getActivityRule());
    }

    private void waitLoginProcess() {
        // TODO - To be replaced with IdlingResource
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
