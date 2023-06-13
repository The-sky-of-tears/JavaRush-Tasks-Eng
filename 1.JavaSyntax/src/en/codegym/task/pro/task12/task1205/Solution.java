package en.codegym.task.pro.task12.task1205;

/* 
A method that divides
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        if ((a > 0 && b == 0)
                || ( a > 0 && Double.isInfinite(a) && b >= 0 && !Double.isInfinite(b))
                || (a < 0 && Double.isInfinite(a) && b < 0 && !Double.isInfinite(b))) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if ((a < 0 && b == 0)
                || ( a < 0 && Double.isInfinite(a) && b >= 0 && !Double.isInfinite(b))
                || (a > 0 && Double.isInfinite(a) && b < 0 && !Double.isInfinite(b))) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if ((a == 0 && b == 0)
                || (Double.isInfinite(a) && Double.isInfinite(b))) {
            System.out.println(Double.NaN);
        } else {
            System.out.println(a / b);
        }
    }
}
