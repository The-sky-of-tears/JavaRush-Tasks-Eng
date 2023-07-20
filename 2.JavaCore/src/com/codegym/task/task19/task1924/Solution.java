package com.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
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

            StringBuilder fileText = new StringBuilder();

            while (br.ready()) {
                fileText.append(br.readLine()).append("\n");
            }

            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                fileText = new StringBuilder(fileText.toString()
                        .replaceAll(String.format("\\b%s\\b", entry.getKey().toString()),
                                entry.getValue()));
            }

            System.out.println(fileText);


        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
}
