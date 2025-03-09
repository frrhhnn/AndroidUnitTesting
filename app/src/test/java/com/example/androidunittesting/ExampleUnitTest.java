package com.example.androidunittesting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Default example unit test class.
 * Contains a basic test to validate the accuracy of the JUnit framework.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /**
     * Tests that the basic Java addition operation works correctly.
     * Verifies that 2 + 2 equals 4.
     */
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}