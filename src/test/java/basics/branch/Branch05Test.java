package basics.branch;

import basics.branch.Branch05;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Branch05Test {

    public static double expected = 7;
    public static double valueVariable = 2;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Branch05.functionComputation(valueVariable),5);
    }
}