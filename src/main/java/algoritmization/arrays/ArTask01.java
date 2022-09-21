package com.epam.IntroductionToJavaOnline.algoritmization.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Potapov Alexey;
 * В массив A[N] занесены натуральные числа. Найти сумму тех эл-тов, которые кратны данному K.
 */

public class ArTask01 {
    public static void main(String[] args) {

        int numberK = 2;
        int counter = 0;
        int summa = 0;

        double[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % numberK == 0) {
                counter++;
                summa += arrayA[i];
            }
        }
    }
}