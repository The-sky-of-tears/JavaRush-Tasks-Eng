package com.codegym.task.task20.task2026;

/* 
Rectangle algorithms

*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Must be 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Must be 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int rectangleCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    rectangleCount++;
                    brushRectangle(a, i, j);
                }
            }
        }

        return rectangleCount;
    }

    private static void brushRectangle(byte[][] a, int startI, int startJ) {
        a[startI][startJ] = 0;

        if (startI + 1 < a.length && a[startI + 1][startJ] == 1) {
            brushRectangle(a, startI + 1, startJ);
        }
        if (startJ + 1 < a.length && a[startI][startJ + 1] == 1) {
            brushRectangle(a, startI, startJ + 1);
        }
    }
}
