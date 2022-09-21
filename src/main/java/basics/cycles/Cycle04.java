package basics.cycles;

/**
 * @author Potapov Alexey;
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 * <p>
 * Anno. Условие задачи несколько некорректно: получим Infinity.
 */

public class Cycle04 {
    public static double sqareMultiplication() {
        double k = 1;
        for (double i = 1; i <= 200; i++) {
            k = k * Math.pow(i, 2);
        }
        return k;
    }

    public static void main(String[] args) {
        sqareMultiplication();
    }
}