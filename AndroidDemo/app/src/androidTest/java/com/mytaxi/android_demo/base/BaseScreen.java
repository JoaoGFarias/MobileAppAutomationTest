package com.mytaxi.android_demo.base;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.activities.MainActivity;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class BaseScreen {

    private final ActivityTestRule activityRule;

    protected ActivityTestRule getActivityRule() {
        return activityRule;
    }

    public BaseScreen(ActivityTestRule<MainActivity> activityRule) {
        this.activityRule = activityRule;
    }

    protected ViewInteraction getElementById(int id) {
        return onView(withId(id));
    }

    protected ViewInteraction getElementWithText(String text) {
        return onView(withText(text));
    }

    protected ViewInteraction searchOnOtherWindows(ViewInteraction element) {
        return this.searchOnOtherWindows(element, activityRule);

    }

    protected ViewInteraction searchOnOtherWindows(ViewInteraction viewInteraction, ActivityTestRule activityRule) {
        return viewInteraction.inRoot(
                withDecorView(
                        not(is(
                                activityRule.getActivity().getWindow().getDecorView()
                        ))
                )
        );

    }
}
