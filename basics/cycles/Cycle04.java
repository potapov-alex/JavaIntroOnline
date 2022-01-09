package com.epam.IntroductionToJavaOnline.basics.cycles;

/**
 * @author Potapov Alexey;
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 *
 * Anno. Условие задачи несколько некорректно: если принимать первые 200 от 0, то при умножении на 0 всегда будет 0.
 * Если принимать от 1, то получим переполнение, даже при использовании BigInteger.
 * Cтавить задачей написание try/cath не указано условием.
 */

public class Cycle04 {
    public static void main(String[] args) {
        double k = 0;
        for (double i = 0; i < 200; i++) {
            k = k * Math.pow(i, 2);
        }
     }
}