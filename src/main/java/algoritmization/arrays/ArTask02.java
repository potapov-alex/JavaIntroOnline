package com.epam.IntroductionToJavaOnline.algoritmization.arrays;

import java.util.Scanner;

/**
 * @author Potapov Alexey;
 * Дана последовательность действительных чисел а1, а1 ... an,
 * заменить все члены больше данного Z этим числом. Посчитать кол-во
 * замен.
 */

public class ArTask02 {
    public static void main(String[] args) {
        int numberZ = 0;
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {

            array[i] = i;
            if (array[i] > numberZ) {
                array[i] = numberZ;
            }
        }
    }
}