package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {

            ArrayList<String> longWords = new ArrayList<>();

            br.lines().forEach(line ->
            {
                String[] wordsFromLine = line.split("\\s");
                for (String word : wordsFromLine) {
                    if (word.length() > 6) {
                        longWords.add(word);
                    }
                }
            });

            bw.write(String.join(",", longWords));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
