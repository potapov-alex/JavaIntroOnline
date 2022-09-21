package basics.line;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Line02Test {
    public static double expected = -45.0625;
    public static int valueA = 2;
    public static int valueB = 4;
    public static int valueC = 6;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Line02.arithmeticFormula(valueA, valueB, valueC), 5);
    }
}
