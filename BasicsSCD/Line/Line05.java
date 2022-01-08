package com.epam.IntroductionToJavaOnline.BasicsSCD.Line;

/**
 * @author Potapov Alexey;
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * НН ч ММ мин SS c.
 */

public class Line05 {
    static int numberT = 123456789;

    public static void main(String[] args) {
        int hoursOfT = numberT / 3600;
        int minutesOfT = (numberT - (hoursOfT * 3600)) / 60;
        int secondsOfT = (numberT - (hoursOfT * 3600) - (minutesOfT * 60));
    }
}