package com.epam.IntroductionToJavaOnline.basics.line;

/**
 * @author Potapov Alexey;
 * Вычислить значение переменной по формуле(все переменные принимают действительные значения)
 */

public class Line03 {
    static void arithmeticFormula(int x, int y) {
        double result = (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan((x * y))));
    }

    public static void main(String[] args) {
        arithmeticFormula(4, 2);
    }
}