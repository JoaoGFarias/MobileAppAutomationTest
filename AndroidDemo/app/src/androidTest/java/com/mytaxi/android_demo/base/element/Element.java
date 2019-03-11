package com.mytaxi.android_demo.base.element;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Element {

    protected final ViewInteraction view;

    public Element(ViewInteraction view) {
        this.view = view;
    }

    public ViewInteraction getView() {
        return view;
    }

    public Element type(String text) {
        this.view.perform(ViewActions.typeText(text));
        return this;
    }

    public Element click() {
        this.view.perform(ViewActions.click());
        return this;
    }

    public Element scrollTo() {
        this.view.perform(ViewActions.scrollTo());
        return this;
    }

    public Element check(ViewAssertion matches) {
        this.view.check(matches);
        return this;
    }

    public Boolean isVisible() {
        try {
            this.view.check(matches(isDisplayed()));
            return true;
        } catch (NoMatchingViewException e) {
            return false;
        }
    }
}
