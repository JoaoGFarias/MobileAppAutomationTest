package com.mytaxi.android_demo.baseTests;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public abstract class AuthenticationActivityTest {


    protected ViewInteraction getLoginButton() {
        return getViewInteraction(R.id.btn_login);
    }

    protected ViewInteraction getUsernameInput() {
        return getViewInteraction(R.id.edt_username);
    }

    protected ViewInteraction getPasswordInput() {
        return getViewInteraction(R.id.edt_password);
    }

    protected ViewInteraction getSearchInput() {
        return getViewInteraction(R.id.textSearch);
    }

    protected void callDriver() {
        getViewInteraction(R.id.fab)
                .perform(click());
    }

    protected void selectDriverNamed(String driverName, ActivityTestRule<MainActivity> activityRule) {
        searchOnAllWindows(getViewInteraction(driverName), activityRule).perform(click());
    }

    private ViewInteraction searchOnAllWindows(ViewInteraction viewInteraction, ActivityTestRule<MainActivity> activityRule) {
        return viewInteraction.inRoot(withDecorView(not(is(activityRule.getActivity().getWindow().getDecorView()))));

    }

    private ViewInteraction getViewInteraction(int id) {
        return onView(withId(id));
    }

    private ViewInteraction getViewInteraction(String text) {
        return onView(withText(text));
    }
}
