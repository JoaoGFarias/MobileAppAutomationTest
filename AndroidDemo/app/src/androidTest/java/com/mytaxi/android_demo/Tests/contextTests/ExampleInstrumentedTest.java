package com.mytaxi.android_demo.Tests.contextTests;

import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.base.BaseTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends BaseTest {
    @Test
    public void useAppContext() {
        assertEquals("com.mytaxi.android_demo", appContext.getPackageName());
    }
}
