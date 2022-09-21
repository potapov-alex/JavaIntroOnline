package basics.cycle;

import basics.cycles.Cycle03;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cycle03Test {
    public static int expected = 338350;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Cycle03.squareSumma());
    }
}
