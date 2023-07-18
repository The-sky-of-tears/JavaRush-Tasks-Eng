package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {

        TreeMap<Character, Integer> symbolFrequency = new TreeMap<>();

        try (BufferedReader bufferedRead = new BufferedReader(new FileReader(args[0]))) {

            while (bufferedRead.ready()) {
                char symbol = (char) bufferedRead.read();

                if (!symbolFrequency.containsKey(symbol)) {
                    symbolFrequency.put(symbol, 1);
                } else {
                    symbolFrequency.replace(symbol, symbolFrequency.get(symbol) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        symbolFrequency.forEach((key, value) -> {
            System.out.printf("%c %d\n", key, value);
        });
    }
}
