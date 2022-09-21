package basics.cycle;

import basics.cycles.Cycle05;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cycle05Test {
    public static double expected = 0.162;
    public static int number = 3;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Cycle05.seriesMember(number), 0.001);
    }
}
