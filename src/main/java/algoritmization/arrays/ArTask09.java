package algoritmization.arrays;

/**
 * @author potap; В массиве из целых чисел с кол-вом эл-тов n найти наиболее часто встречающееся число.
 * Если таких несколько - опередить наименьшее.
 */

public class ArTask09 {
    public static int[] arrayA = {1, 2, 1, 7, 2, 6, 1, 7, 4, 5};
    public static int index;

    public static void main(String[] args) {
        getMaxRepeatedNumber(arrayA);
    }

    public static int getMaxRepeatedNumber(int[] arrayA) {
        int[] counts = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arrayA.length; j++) {
                if (arrayA[i] == arrayA[j])
                    count++;
            }
            counts[i] = count;
            if (counts[i] == counts[index])
                index = arrayA[index] > arrayA[i] ? i : index;
            else
                index = count > counts[index] ? i : index;
        }
        return index;
    }
}