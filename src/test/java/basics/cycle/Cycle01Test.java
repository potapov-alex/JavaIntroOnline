package basics.cycle;

import basics.cycles.Cycle01;
import basics.line.Line01;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cycle01Test {
    public static int expected = 78;
    public static int number = 13;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Cycle01.summCustomNumber(number));
    }
}
