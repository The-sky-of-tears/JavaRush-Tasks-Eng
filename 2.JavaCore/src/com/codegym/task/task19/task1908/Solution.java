package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName;
        String secondFileName;

        try {
            firstFileName = console.readLine();
            secondFileName = console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(firstFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(secondFileName))) {

            StringBuilder numbersToWrite = new StringBuilder();
            br.lines().forEach(line -> {
                String[] words = line.split("\\s");

                for (String word : words) {

                    if (Pattern.matches("\\d+", word)) {
                        numbersToWrite.append(word).append(" ");
                    }

                }
            });

            bw.write(numbersToWrite.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            console.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
