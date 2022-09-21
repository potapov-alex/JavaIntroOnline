package basics.branch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Branch02Test {
    public static int expected = 14;
    public static int variableA = 14;
    public static int variableB = 15;
    public static int variableC = 11;
    public static int variableD = 13;

    @Test
    public void SimplePositiveTestAssert14() {
        assertEquals(expected, Branch02.mathMax(variableA, variableB, variableC, variableD));
    }
}