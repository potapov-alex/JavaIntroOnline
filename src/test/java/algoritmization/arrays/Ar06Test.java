package algoritmization.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ar06Test {
    public static int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    @Test
    public void SimplePositiveTestAssertTrue() {
        ArTask06.calculationgPrime(arrayA);
        assertEquals(41, ArTask06.summaOfPrimeNumbers);
        assertEquals(6, ArTask06.counterOfPrimeNumbers);
    }
}