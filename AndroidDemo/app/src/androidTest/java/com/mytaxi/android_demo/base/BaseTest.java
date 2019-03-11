package com.mytaxi.android_demo.base;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.AccessibilityChecks;
import android.support.test.rule.GrantPermissionRule;

import org.junit.BeforeClass;
import org.junit.Rule;

public class BaseTest {
    protected final Context appContext = InstrumentationRegistry.getTargetContext();

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);

    @BeforeClass
    public static void enableAccessibilityChecks() {
        AccessibilityChecks.enable().setThrowExceptionForErrors(false);
    }
}
