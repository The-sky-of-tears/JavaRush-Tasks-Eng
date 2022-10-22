package en.codegym.task.pro.task05.task0512;

/* 
Creating a multi-array
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (var firstDim : multiArray) {
            for (var secondDim : firstDim) {
                for (var thirdDim : secondDim) {
                    System.out.print(thirdDim + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
