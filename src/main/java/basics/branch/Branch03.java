package basics.branch;

/**
 * @author @author Potapov Alexey;
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить,
 * будут ли они расположены на одной прямой.
 */

public class Branch03 {
    public static boolean locationCheck(int x1, int x2, int x3, int y1, int y2, int y3) {
        double s = (((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1)));
        if (s == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(locationCheck(-2, 5, 4, 3, 16, -1));
    }
}