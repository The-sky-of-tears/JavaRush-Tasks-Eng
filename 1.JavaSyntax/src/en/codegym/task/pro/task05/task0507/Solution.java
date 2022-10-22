package en.codegym.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Maximum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int N = in.nextInt();

        array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
