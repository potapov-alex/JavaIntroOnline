package com.epam.IntroductionToJavaOnline.basics.cycles;

import java.util.ArrayList;

/**
 * @author Potapov Alexey;
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 * <p>
 * Anno: ТЗ не конкретизировано, до конца не понятно нужно ли находить символы входящие в состав чисел одновременно.
 */

public class Cycle08 {
    public static void main(String[] args) {
        int numA = 43210;
        int numB = 835;

        char[] charArrayA = Integer.toString(numA).toCharArray(); //преобразуем число A в массив символов
        char[] charArrayB = Integer.toString(numB).toCharArray(); //преобразуем число B в массив символов

        int[] arrayA = new int[charArrayA.length]; //массив цифр числа А, количество цифр в числе А равно длине массива символов
        int[] arrayB = new int[charArrayB.length]; //массив цифр числа В, количество цифр в числе В равно длине массива символов

        System.out.print("Число " + numA + " состоит из цифр: ");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Character.getNumericValue(charArrayA[i]);
            System.out.print(arrayA[i] + " ");
        }

        System.out.print("\nЧисло " + numB + " состоит из цифр: ");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = Character.getNumericValue(charArrayB[i]);
            System.out.print(arrayB[i] + " ");
        }

        ArrayList<Integer> arrayC = new ArrayList<>();
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    arrayC.add(arrayA[i]);
                }
            }
        }
        System.out.print("\nЧисла входящие в состав чисел одновременно: ");
        for (int a : arrayC) {
            System.out.printf(a + " ");
        }
    }
}