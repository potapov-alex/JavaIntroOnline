package basics.branch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Branch04Test {
    public static boolean expected = true;
    public static int coordX = 2;
    public static int coordY = 3;
    public static int coordZ = 4;
    public static int sizeA = 5;
    public static int sizeB = 6;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Branch04.sizeComparison(coordX, coordY, coordZ, sizeA, sizeB));
    }
}