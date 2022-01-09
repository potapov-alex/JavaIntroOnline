package com.epam.IntroductionToJavaOnline.basics.line;

/**
 * @author Potapov Alexey;
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Line04 {
    static double numberR = 999.555;

    public static void main(String[] args) {
        double number = (numberR * 1000) % 1000 + (int) numberR / 1000.0;
    }
}