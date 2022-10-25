package en.codegym.task.pro.task06.task0612;

/* 
Everything has a root
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            double elementSqrt = Math.sqrt(element);

            System.out.println("The square root of " + element + " is " + elementSqrt);
        }
    }
}
