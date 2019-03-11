package com.mytaxi.android_demo.pageObjects;

import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.base.BaseScreen;
import com.mytaxi.android_demo.base.element.Element;

public class AuthenticationScreen extends BaseScreen {


    public AuthenticationScreen(ActivityTestRule activityRule) {
        super(activityRule);
    }

    public Element getLoginButton() {
        return getElementById(R.id.btn_login);
    }

    public Element getUsernameInput() {
        return getElementById(R.id.edt_username);
    }

    public Element getPasswordInput() {
        return getElementById(R.id.edt_password);
    }


    public MainScreen login(String username, String password) {
        this.getUsernameInput().type(username);
        this.getPasswordInput().type(password);
        this.getLoginButton().click();
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

    public Boolean isOpen() {
        return this.getUsernameInput().isVisible();
    }
}
