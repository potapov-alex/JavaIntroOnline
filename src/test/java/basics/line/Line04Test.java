package basics.line;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Line04Test {
    public static double expected = 666.999;
    public static double actual = 999.666;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Line04.revert(actual), 5);
    }
}