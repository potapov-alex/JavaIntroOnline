package basics.branch;

/**
 * @author @author Potapov Alexey;
 * find max(min(a,b),min(c,d))
 */

public class Branch02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        mathMax(a, b, c, d);
    }

    public static int mathMax(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}