package com.epam.IntroductionToJavaOnline.BasicsSCD.Cycles;

/**
 * @author potap; Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Cycle02 {

    public static int a = 0;
    public static int b = 8;
    public static int h = 2;
    public static int step = a;

    public static int valueFunctionSegment(int step) {
        int y = 0;
        if (step > 2) {
            y = step;
        } else {
            y = -step;
        }
        return y;
    }

    public static void main(String[] args) {
        do {
            System.out.println(valueFunctionSegment(step));
            step += h;
        }
        while (step <= b);
    }
}