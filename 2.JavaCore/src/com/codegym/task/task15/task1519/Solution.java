package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String stringValue;
        int intValue;
        short shortValue;
        double doubleValue;

        while (true) {
            if (in.hasNextInt()) {

                intValue = in.nextInt();

                if (intValue > 0 && intValue < 128) {
                    print((short) intValue);
                } else {
                    print(intValue);
                }

            } else if (in.hasNextDouble()) {

                doubleValue = in.nextDouble();
                print(doubleValue);

            } else if (in.hasNextLine()){

                stringValue = in.next();

                if (!stringValue.equals("exit")) {
                    print(stringValue);
                } else {
                    break;
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
