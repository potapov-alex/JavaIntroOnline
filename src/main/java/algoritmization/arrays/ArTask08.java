package algoritmization.arrays;

import java.util.*;

/**
 * @author potap;
 * Дана последовательность a1, a2, ..., an.
 * Сформировать новую последовательность выбросив из существующей члены равные = min(a1, a2, ..., an+1)
 */

public class ArTask08 {

    public static int[] arrayA = {1, 2, 1, 7, 2, 6, 1, 7, 4, 5};
    public static int minOfArrayA;
    public static int counter;

    public static void main(String[] args) {

    }

    public static int getMinFromArray(int[] arrayA) {
        for (int i : arrayA) {
            if (i < minOfArrayA) {
                minOfArrayA = i;
            }
        }
        return minOfArrayA;
    }

    public static int getArrayBLength(int[] arrayA) {
            for (int i : arrayA) {
            if (i == minOfArrayA) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] newArrayCreation(int[] arrayA) {

        int[] arrayB = new int[arrayA.length-counter];

        return arrayB;
    }
}