package com.epam.IntroductionToJavaOnline.BasicsSCD.Cycles;

/**
 * @author potap; Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Cycle02 {

    public static int valueFunctionSegment(int a, int b, int h) {
        int y = 0;
        while (a <= b) {
            if (a > 2) {
                y = a;
            } else {
                y = -a;
            }
            a = a + h;
        }
        return y;
    }

    public static void main(String[] args) {
        valueFunctionSegment(1, 7, 2);
    }
}