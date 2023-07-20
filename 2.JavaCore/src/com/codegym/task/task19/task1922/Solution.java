package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) {

        String fileName;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            br.lines().forEach(line -> {
                int counter = 0;
                String[] lineWords = line.split("\\s");

                for (String word : lineWords) {
                    if (words.contains(word)) {
                        counter++;
                    }
                }

                if (counter == 2) {
                    System.out.println(line);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
}
