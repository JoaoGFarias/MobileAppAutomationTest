package com.mytaxi.android_demo.base.element;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.contrib.DrawerMatchers;

import static android.support.test.espresso.assertion.ViewAssertions.matches;

public class DrawerElement extends Element {
    public DrawerElement(ViewInteraction view) {
        super(view);
    }

    public DrawerElement checkIsClosed(int gravityView) {
        view.check(matches(DrawerMatchers.isClosed(gravityView)));
        return this;
    }

    public DrawerElement open() {
        view.perform(DrawerActions.open());
        return this;
    }
}
