package algoritmization.arrays;

/**
 * @author potap;
 * Задана последовательность N вещественных чисел. Вычислить
 * сумму тех, порядковые номера которых явл простыми.
 */

public class ArTask06 {
    public static int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public static int summaOfPrimeNumbers;
    public static int counterOfPrimeNumbers;

    public static void main(String[] args) {
        calculationgPrime(arrayA);
    }

    public static void calculationgPrime(int[] arrayA) {
        for (int i = 1; i < arrayA.length; i++) {
            if (primeNumber(i) == true) {
                summaOfPrimeNumbers += arrayA[i];
                counterOfPrimeNumbers++;
            }
        }
    }

    public static boolean primeNumber(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}