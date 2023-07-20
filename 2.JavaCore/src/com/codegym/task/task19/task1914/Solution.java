package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream myReader = new PrintStream(baos);
        System.setOut(myReader);
        testString.printSomething();

        System.setOut(console);
        String[] output = baos.toString().split(" ");
        int result = 0;
        switch (output[1]) {
            case "+":
                result = Integer.parseInt(output[0]) + Integer.parseInt(output[2]);
                break;
            case "-":
                result = Integer.parseInt(output[0]) - Integer.parseInt(output[2]);
                break;
            case "*":
                result = Integer.parseInt(output[0]) * Integer.parseInt(output[2]);
                break;
        }

        System.out.printf("%s %s %s = %d", output[0], output[1], output[2], result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

