package com.epam.IntroductionToJavaOnline.BasicsSCD.Line;

//Вычислить значение переменной по формуле(все переменные принимают действительные значения)

public class Line2 {
    static void arithmeticFormula(int a, int b, int c) {
        double result = (((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2)));
        System.out.println(result);
    }

    public static void main(String[] args) {
        arithmeticFormula(2,4,6);
    }
}
