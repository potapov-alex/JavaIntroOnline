package com.epam.IntroductionToJavaOnline.basics.line;

/**
 * @author Potapov Alexey;
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */

public class Line06 {
    static int coordX = 1;
    static int coordY = 1;

    static boolean coordinatePointCalculation(int coordX, int coordY) {
        if ((coordX >= -2 && coordX <= 2 && coordY >= 0 && coordY <= 4) || (coordY >= -3 && coordY <= 0 && coordX >= -4 && coordX <= 4)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        coordinatePointCalculation(coordX, coordY);
    }
}