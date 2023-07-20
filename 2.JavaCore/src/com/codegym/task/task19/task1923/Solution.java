package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {

            bufferedReader.lines()
                    .map(line -> line.split("\\s"))
                    .forEach(words -> {
                        for (String word : words) {
                            if (Pattern.matches(".*\\d.*", word)) {
                                try {
                                    bufferedWriter.write(word + " ");
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }

                        }
                    });

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
