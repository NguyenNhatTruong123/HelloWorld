package com.example.helloworld;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasSibling;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withChild;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.app.Application;
import android.content.Context;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.test.rule.ActivityTestRule;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> rule  = new ActivityTestRule<>(MainActivity.class);
//    @Before
//    public void setup(){
//
//    }
    @Test
    public void checkView() {
        // Context of the app under test.
    //        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    //        assertEquals("com.example.helloworld", appContext.getPackageName());
//        onView(withText("Hello World!")).check(matches(isDisplayed()));
        //openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getInstrumentation().getTargetContext());

//        onView()
//                .check(matches(isDisplayed()));
//        onView(hasSibling(withText("Hello")));
        onView(withId(R.id.textView)).check(matches(withText("Hello Worlddd!")));
    }
}