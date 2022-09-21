package basics.cycle;

import basics.cycles.Cycle02;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cycle02Test {
    public static int expected = 2;
    public static int step = -2;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Cycle02.valueFunctionSegment(step));
    }
}
