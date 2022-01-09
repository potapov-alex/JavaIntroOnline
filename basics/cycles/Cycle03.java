package com.epam.IntroductionToJavaOnline.basics.cycles;

/**
 * @author Potapov Alexey;
 * Найти сумму квадратов первых ста чисел.
 */

public class Cycle03 {

    public static double squareSumm() {
        int i = 1;
        double k;

        for (k = 0; i < 100; i++) {
            k += Math.pow(i, 2);

        }
        return k;
    }

    public static void main(String[] args) {
        squareSumm();
    }
}