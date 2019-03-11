package com.mytaxi.android_demo.base;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.base.element.DrawerElement;
import com.mytaxi.android_demo.base.element.Element;
import com.mytaxi.android_demo.base.element.NavigationElement;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public abstract class BaseScreen {

    private final ActivityTestRule activityRule;

    protected ActivityTestRule getActivityRule() {
        return activityRule;
    }

    public BaseScreen(ActivityTestRule<MainActivity> activityRule) {
        this.activityRule = activityRule;
    }

    public abstract Boolean isOpen();

    protected DrawerElement getDrawerById(int id) {
        return wrapViewOnDrawer(onView(withId(id)));
    }

    private DrawerElement wrapViewOnDrawer(ViewInteraction view) {
        return new DrawerElement(view);
    }

    protected NavigationElement getNavigationById(int id) {
        return wrapViewOnNavigation(onView(withId(id)));
    }

    private NavigationElement wrapViewOnNavigation(ViewInteraction view) {
        return new NavigationElement(view);
    }

    protected Element getElementById(int id) {
        return wrapViewOnElement(onView(withId(id)));
    }

    protected Element getElementWithText(String text) {
        return wrapViewOnElement(onView(withText(text)));
    }

    protected Element searchOnOtherWindows(Element element) {
        return this.searchOnOtherWindows(element, activityRule);

    }

    protected Element searchOnOtherWindows(Element element, ActivityTestRule activityRule) {
        ViewInteraction view = element.getView().inRoot(
                withDecorView(
                        not(is(
                                activityRule.getActivity().getWindow().getDecorView()
                        ))
                )
        );
        return wrapViewOnElement(view);
    }

    private Element wrapViewOnElement(ViewInteraction view) {
        return new Element(view);
    }
}
