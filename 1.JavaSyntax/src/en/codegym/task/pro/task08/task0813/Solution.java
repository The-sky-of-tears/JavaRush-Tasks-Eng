package en.codegym.task.pro.task08.task0813;

/* 
Power of two
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(-3));
    }

    public static int getPowerOfTwo(int power) {
        int result = 1;
        if (power >= 0) {
            result <<= power;
        } else {
            result <<= -power;
        }
        return result;
    }
}
