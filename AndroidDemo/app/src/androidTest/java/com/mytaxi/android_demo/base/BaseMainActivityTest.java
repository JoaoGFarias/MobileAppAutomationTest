package com.mytaxi.android_demo.base;

import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.Rule;

public class BaseMainActivityTest extends BaseTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);
}
