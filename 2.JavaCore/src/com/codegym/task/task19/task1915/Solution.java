package com.codegym.task.task19.task1915;

/* 
Duplicate text

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        try {
            fileName = console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        PrintStream consolePrintStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream myReader = new PrintStream(baos);
        System.setOut(myReader);

        testString.printSomething();

        try (FileOutputStream fos = new FileOutputStream(fileName)) {

            fos.write(baos.toByteArray());

        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException();
        }

        System.setOut(consolePrintStream);
        System.out.println(baos.toString());

        console.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

