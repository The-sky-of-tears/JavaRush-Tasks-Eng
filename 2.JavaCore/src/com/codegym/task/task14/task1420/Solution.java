package com.codegym.task.task14.task1420;

import java.util.Scanner;
/* 
GCD

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a, b;

        a = in.nextInt();
        b = in.nextInt();

        if (a < 1 || b < 1) {
            throw new IllegalArgumentException();
        }

        System.out.println(GCD(a, b));
    }

    private static int GCD(int a, int b) {
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);
    }
}
