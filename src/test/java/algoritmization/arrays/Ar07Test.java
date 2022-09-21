package algoritmization.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ar07Test {
    public static int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void SimplePositiveTestAssertTrue() {
        ArTask07.getMaxSumma(arrayA);
        assertEquals(15, ArTask07.maxSumma);
    }
}