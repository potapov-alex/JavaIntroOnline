package basics.line;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Line05Test {
    public static String expected = "34293 ч 33 м 9 с.";
    public static int timeInT = 123456789;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Line05.changingTime(timeInT));
    }
}