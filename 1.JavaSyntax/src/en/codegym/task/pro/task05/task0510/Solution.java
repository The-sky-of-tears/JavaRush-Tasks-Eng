package en.codegym.task.pro.task05.task0510;

/* 
Triangular array
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];

            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }

        for (var row : result) {
            for (var cell : row) {
                System.out.print(cell + " ");
            }

            System.out.println();
        }
    }
}
