package com.epam.IntroductionToJavaOnline.algoritmization.arrays;

/**
 * @author Potapov Alexey;
 * Дан массив действительных чисел, размерность которого N,
 * Посчитать кол-во положительных, отриц и нулевых эл-тов.
 */

public class ArTask03 {
    public static void main(String[] args) {
        int[] arrayA = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int counterPos;
        counterPos = 0;
        int counterNeg;
        counterNeg = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] < 0) {
                counterNeg++;
            } else {
                counterPos++;
            }
        }
    }
}