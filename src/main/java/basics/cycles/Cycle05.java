package basics.cycles;

/**
 * @author Potapov Alexey;
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * общий член ряда a(n) = ((1/2^n)+(1/3^n))
 */

public class Cycle05 {
    public static int startNumberSeries = 1;
    public static int endNumberSeries = 5;
    public static double numberE = 0.15;
    public static double membersSeriesSumma = 0;

    public static double seriesMember(int n) {
        return ((1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n))));
    }

    public static double numberSeriesSumma(double member) {
        membersSeriesSumma += member;
        return membersSeriesSumma;
    }

    public static void main(String[] args) {
        for (; startNumberSeries <= endNumberSeries; startNumberSeries++) {
            if (Math.abs(seriesMember(startNumberSeries)) > numberE) {
                numberSeriesSumma(seriesMember(startNumberSeries));
            }
        }
    }
}