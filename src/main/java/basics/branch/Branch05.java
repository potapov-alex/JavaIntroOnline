package basics.branch;

/**
 * @author Potapov Alexey;
 * Вычислить значение функции:
 */

public class Branch05 {

    public static double functionValue = 1;
    public static double functionComputation(double x) {
        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        return result;
    }

    public static void main(String[] args) {
        double functionResult = functionComputation(functionValue);
        System.out.println(functionResult);
    }
}