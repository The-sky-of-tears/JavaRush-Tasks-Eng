package en.codegym.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();

        multiArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int columns = in.nextInt();
            multiArray[i] = new int[columns];
        }
    }
}
