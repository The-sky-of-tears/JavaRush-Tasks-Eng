package com.codegym.task.task18.task1820;

import java.io.*;
import java.util.Scanner;
/* 
Rounding numbers

*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fileWithDoubles;
        String fileWithInts;

        try {
            fileWithDoubles = console.nextLine();
            fileWithInts = console.nextLine();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return;
        }

        try (Scanner file = new Scanner(new FileInputStream(fileWithDoubles));
             PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileWithInts))) {

            while (file.hasNextDouble()) {
                double value = file.nextDouble();
                printWriter.print((int) Math.round(value) + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
