package algoritmization.arrays;

/**
 * @author potap; Даны действительные числа a1, a2, ..., an.
 * не удалось получить уточнения по условию: "Найти max(a1 + a2n, a2 + a2n-1, ..., an+1)"
 * невозможно получить массив "a2n" или "an+1"
 * выполнено для "Найти max(a1 + an/2+1)"
 */

public class ArTask07 {
    public static int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int maxSumma;

    public static void main(String[] args) {
        getMaxSumma(arrayA);
    }

    public static int getMaxSumma(int[] arrayA) {
        if (arrayA.length % 2 != 0) {
        } else {
            for (int i = 0; i < arrayA.length / 2; i++) {
                int summ = arrayA[i] + arrayA[arrayA.length / 2 + i];

                if (maxSumma < summ) {
                    maxSumma = summ;
                }
            }
        }
        return maxSumma;
    }
}