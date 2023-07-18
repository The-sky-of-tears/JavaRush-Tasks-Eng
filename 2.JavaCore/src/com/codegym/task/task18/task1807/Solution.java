package com.codegym.task.task18.task1807;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/* 
Counting commas

*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buffer;
            int countCommas = 0;

            if (fis.available() > 0) {
                buffer = new byte[fis.available()];
                fis.read(buffer, 0, buffer.length);

                for (byte symbol : buffer) {
                    if (symbol == (int) ',') {
                        countCommas++;
                    }
                }
            }

            System.out.println(countCommas);

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
