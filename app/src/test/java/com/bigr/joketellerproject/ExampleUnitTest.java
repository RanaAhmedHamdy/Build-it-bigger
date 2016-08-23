package com.bigr.joketellerproject;

import android.test.AndroidTestCase;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest extends AndroidTestCase {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testJokeDownload() {

        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);

            assertTrue(joke.length() > 0);
            assertTrue(!joke.isEmpty());

        } catch (Exception e) {
            fail("Time out");
        }
    }
}