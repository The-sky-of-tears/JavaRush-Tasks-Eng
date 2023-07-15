package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try {
            Scanner in = new Scanner(System.in);
            String key = in.nextLine();

            if (key.equals("helicopter")) {
                result = new Helicopter();
            } else if (key.equals("plane")) {
                result = new Plane(in.nextInt());
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
