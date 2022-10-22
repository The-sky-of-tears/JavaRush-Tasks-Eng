package en.codegym.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int N = in.nextInt();

        int[] array;

        if (N > 0) {
            array = new int[N];

            for (int i = 0; i < N; i++) {
                array[i] = in.nextInt();
            }
        } else {
            return;
        }

        if (N % 2 == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = array.length - 1; i >= 0 ; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
