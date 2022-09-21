package basics.cycle;

import basics.cycles.Cycle05;
import basics.cycles.Cycle06;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cycle06Test {
    public static char expected = 'µ';
    public static int numberOfChar = 181;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Cycle06.charPrinting(numberOfChar));
    }
}
