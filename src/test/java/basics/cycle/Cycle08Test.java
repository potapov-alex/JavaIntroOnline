package basics.cycle;

import basics.cycles.Cycle08;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Cycle08Test {
    public static int[] expected = {8, 5};
    public static int expectedNumber = 85;

    @Test
    public void SimplePositiveTestGetCharsArray() {
        assertTrue("Arrays are not equal", java.util.Arrays.equals(expected, Cycle08.arrayOfCharNumbers(expectedNumber)));
    }

}