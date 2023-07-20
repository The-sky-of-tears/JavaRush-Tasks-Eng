package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;

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

            StringBuilder textToWrite = new StringBuilder();
            br.lines().forEach(line -> {
                textToWrite.append(line.replaceAll("[\\p{Punct}\\n]", ""));
            });

            bw.write(textToWrite.toString());

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
