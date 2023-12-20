package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test(testName = "verify 1 is 1 its true",description = "This test for verify 1 is 1")
    public void shouldReturnTrue()
    {
        assertEquals(1,1);
    }

    @Test(testName = "verify 1 is 2 its false",description = "This test for verify 1 is 2")
    public void shouldReturnFalse()

    {
        assertEquals(1,2);
    }
}

