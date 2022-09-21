package basics.branch;

/**
 * @author Potapov Alexey;
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Branch04 {

    public static boolean sizeComparison(double x, double y, double z, double sizeA, double sizeB) {
        boolean i = false;
        if ((((x <= sizeA) && (y <= sizeB)) ||
                ((y <= sizeA) && (x <= sizeB))) ||
                (((y <= sizeA) && (z <= sizeB)) ||
                        ((z <= sizeA) && (y <= sizeB))) ||
                (((x <= sizeA) && (z <= sizeB)) ||
                        ((z <= sizeA) && (x <= sizeB))))
            i = true;
        return i;
    }

    public static void main(String[] args) {
        sizeComparison(2, 3, 4, 5, 6);

    }
}