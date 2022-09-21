package basics.line;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Line03Test {
    public static double expected = -45.0625;
    public static int valueX = 2;
    public static int valueY = 4;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Line03.arithmeticFormula(valueX, valueY), 5);
    }
}