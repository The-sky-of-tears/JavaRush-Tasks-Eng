package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        try {
            fileName = console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        int wordCounter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String lineFromFile;
            while(br.ready()) {
                lineFromFile = br.readLine();

                br.lines();

                String regex = "\\bworld\\b";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher =  pattern.matcher(lineFromFile);

                while (matcher.find()) {
                    wordCounter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(wordCounter);

        try {
            console.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
