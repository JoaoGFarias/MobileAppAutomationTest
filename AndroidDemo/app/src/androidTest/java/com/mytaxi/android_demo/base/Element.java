package com.mytaxi.android_demo.base;

import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;

public class Element {

    private final ViewInteraction view;

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
}
