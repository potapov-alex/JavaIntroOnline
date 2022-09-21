package basics.branch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Branch03Test {
    public static boolean expected = false;
    public static int coordX1 = -2;
    public static int coordX2 = 5;
    public static int coordX3 = 4;
    public static int coordY1 = 3;
    public static int coordY2 = 16;
    public static int coordY3 = -1;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Branch03.locationCheck(coordX1,coordX2,coordX3,coordY1,coordY2,coordY3));
    }
}