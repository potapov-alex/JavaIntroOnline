package basics.branch;

/**
 * @author Potapov Alexey; Даны два угла треугольника (в градусах). Определить,
 * существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Branch01 {
    public static boolean triangleCheck(int angleA, int angleB) {
        if (angleA + angleB >= 180)
            return true;
        if (angleA == 90 || angleB == 90 || angleA + angleB == 90) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        triangleCheck(42, 48);
    }
}