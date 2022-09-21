package basics.line;

/**
 * @author Potapov Alexey;
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * НН ч ММ мин SS c.
 */

public class Line05 {
    public static int numberT = 123456789;

    public static void main(String[] args) {
        changingTime(numberT);
    }

    public static String changingTime(int numberT) {
        int hoursOfT = numberT / 3600;
        int minutesOfT = (numberT - (hoursOfT * 3600)) / 60;
        int secondsOfT = (numberT - (hoursOfT * 3600) - (minutesOfT * 60));
        String s = hoursOfT + " ч " + minutesOfT + " м " + secondsOfT + " с.";
        System.out.println(s);
        return s;
    }
}