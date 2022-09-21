package basics.cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Potapov Alexey;
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Cycle07 {

    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите натуральное число m = ");
        int numM = Integer.parseInt(reader.readLine());
        System.out.print("Введите натуральное число n = ");
        int numN = Integer.parseInt(reader.readLine());

        int count;
        for (int i = numM; i <= numN; i++) {
            System.out.print("Для числа " + i + " будут следующие делители - ");
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
            if (count == 0) {
                if (i == 1) {
                    System.out.println("делители отсутствуют (кроме 1)");
                } else {
                    System.out.println("делители отсутствуют (кроме 1 и " + i + ")");
                }
            } else {
                System.out.println();
            }
        }
    }
}