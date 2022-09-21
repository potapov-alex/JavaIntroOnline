package basics.cycles;

import java.util.Scanner;

/**
 * @author Potapov Alexey;
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
 * введенного пользователем числа.
 */

public class Cycle01 {

    public static int customIntNumberEnter() {
        @SuppressWarnings("resource") Scanner sA = new Scanner(System.in);
        System.out.println("enter simple positive number");
        int number = 0;
        return number = sA.nextInt();
    }

    public static int summCustomNumber(int number) {
        int summa = 0;
        for (int i = 0; i < number; i++) {
            summa = summa + i;
        }
        System.out.println(summa);
        return summa;
    }

    public static void main(String[] args) {
        summCustomNumber(customIntNumberEnter());
    }
}