package com.bookwiki;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.bookwiki.BookWikiActivityTest \
 * com.bookwiki.tests/android.test.InstrumentationTestRunner
 */
public class BookWikiActivityTest extends ActivityInstrumentationTestCase2<BookWikiActivity> {

    public BookWikiActivityTest() {
        super("com.bookwiki", BookWikiActivity.class);
    }

}
