package basics.cycles;

/**
 * @author Potapov Alexey;
 * Найти сумму квадратов первых ста чисел.
 */

public class Cycle03 {

    public static int squareSumma() {

        int k = 0;

        for (int i = 1; i <= 100; i++) {
            k += Math.pow(i, 2);

        }
        System.out.println(k);
        return k;
    }

    public static void main(String[] args) {
        squareSumma();
    }
}