package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Double> data = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader(args[0]))) {

            bufferedReader.lines()
                    .map(line -> line.split("\\s"))
                    .forEach(array -> {
                        if (data.containsKey(array[0])) {
                            data.put(array[0], data.get(array[0]) + Double.parseDouble(array[1]));
                        } else {
                            data.put(array[0], Double.parseDouble(array[1]));
                        }
                    });

            Double maxSalary = data.entrySet().stream()
                    .max(Map.Entry.comparingByValue()).get().getValue();

            data.entrySet().stream()
                    .filter(entry -> entry.getValue().equals(maxSalary))
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> System.out.println(entry.getKey()));

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
