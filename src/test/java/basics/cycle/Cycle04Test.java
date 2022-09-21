package basics.cycle;

import basics.cycles.Cycle04;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cycle04Test {
    public static double expected = 0;

    @Test
    public void SimplePositiveTestAssertTrue() {
        assertEquals(expected, Cycle04.sqareMultiplication(),1);
    }
}