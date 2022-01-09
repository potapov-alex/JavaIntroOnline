package com.epam.IntroductionToJavaOnline.basics.branch;

/**
 * @author @author Potapov Alexey;
 * find max(min(a,b),min(c,d))
 */

public class Branch02 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int x = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("max of (min(a,b) & min(c,d)" +x);
    }
}