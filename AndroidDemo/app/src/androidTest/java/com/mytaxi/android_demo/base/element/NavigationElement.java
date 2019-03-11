package com.mytaxi.android_demo.base.element;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.NavigationViewActions;

public class NavigationElement extends Element {

    public NavigationElement(ViewInteraction view) {
        super(view);
    }

    public NavigationElement navigateTo(int targetElement) {
        view.perform(NavigationViewActions.navigateTo(targetElement));
        return this;
    }
}
