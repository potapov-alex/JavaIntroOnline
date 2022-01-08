package com.epam.IntroductionToJavaOnline.BasicsSCD.Line;

/**
 * @author Potapov Alexey;
 * найдите значение функции z=((a-3)*b/2)+c
 */

public class Line01 {
    static void function(int a, int b, int c) {
        int z = ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        function(3, 4, 5);
    }
}