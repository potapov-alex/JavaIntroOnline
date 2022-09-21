package com.epam.IntroductionToJavaOnline.algoritmization.arrays;

/**
 * @author Potapov Alexey;
 * Даны действительные числа a1...an, поменять местами наибольший и наименьший эл-т.
 */

public class ArTask04 {

    public static void main(String[] args) {

        int max;
        max = 0;
        int min;
        min = 0;
        int temp;
        int numeric;
        numeric = 10;
        int[] arrayA;
        arrayA = new int[numeric];

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 20 - 10);

            if (arrayA[i] > arrayA[max]) {
                max = i;
            }
            if (arrayA[i] < arrayA[min]) {
                min = i;
            }
        }

        temp = arrayA[max];
        arrayA[max] = arrayA[min];
        arrayA[min] = temp;
    }
}
