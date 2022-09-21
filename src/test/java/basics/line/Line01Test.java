package basics.line;

import basics.branch.Branch01;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Line01Test {
    public static int expected = 5;
    public static int valueA = 3;
    public static int valueB = 4;
    public static int valueC = 5;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Line01.function(valueA, valueB, valueC));
    }
}
