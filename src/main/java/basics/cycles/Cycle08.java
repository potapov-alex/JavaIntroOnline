package basics.cycles;

import java.util.ArrayList;

/**
 * @author Potapov Alexey;
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Cycle08 {
    public static int numA = 43210;
    public static int numB = 835;

    public static int[] arrayOfCharNumbers(int number) {
        char[] charsArray = Integer.toString(number).toCharArray(); //преобразуем число в массив символов
        int[] array = new int[charsArray.length]; //массив цифр числа, количество цифр в числе равно длине массива символов
        System.out.print("Number " + number + " consists of numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(charsArray[i]);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static ArrayList arraysNumbersCompare(int[] arrayA, int[] arrayB) {
        ArrayList<Integer> arrayC = new ArrayList<>();
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    arrayC.add(arrayA[i]);
                }
            }
        }
        System.out.print("\nNumbers that are part of numbers the same: ");
        for (int a : arrayC) {
            System.out.printf(a + " ");
        }
        return arrayC;
    }

    public static void main(String[] args) {
        arraysNumbersCompare(arrayOfCharNumbers(numA), arrayOfCharNumbers(numB));
    }
}