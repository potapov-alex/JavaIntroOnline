package basics.branch;

import basics.branch.Branch01;
import org.junit.Test;

import static org.junit.Assert.*;

public class Branch01Test {
    public static boolean expected = true;
    public static int angelA = 42;
    public static int angelB = 48;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Branch01.triangleCheck(angelA, angelB));
    }
}