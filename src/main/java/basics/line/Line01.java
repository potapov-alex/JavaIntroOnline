package basics.line;

/**
 * @author Potapov Alexey;
 * найдите значение функции z=((a-3)*b/2)+c
 */

public class Line01 {
    public static int function(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        System.out.print(function(3, 4, 5));
    }
}