package com.codegym.task.task18.task1803;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String fileName;

        try {
            fileName = in.nextLine();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return;
        }

        try (FileInputStream fis = new FileInputStream(fileName)) {

            Map<Byte, Integer> byteFrequency = new HashMap<>();
            Byte readByte = null;

            while (fis.available() > 0) {
                readByte = (byte) fis.read();

                if (byteFrequency.containsKey(readByte)) {
                    byteFrequency.replace(readByte, byteFrequency.get(readByte) + 1);
                } else {
                    byteFrequency.put(readByte, 1);
                }
            }

            Integer maxFrequency = Integer.MIN_VALUE;
            for (Map.Entry<Byte, Integer> entry : byteFrequency.entrySet()) {
                if (entry.getValue().compareTo(maxFrequency) > 0) {
                    maxFrequency = entry.getValue();
                }
            }

            StringBuilder answer = new StringBuilder();
            for (Map.Entry<Byte, Integer> entry : byteFrequency.entrySet()) {
                if (entry.getValue().equals(maxFrequency)) {
                    answer.append(entry.getKey()).append(" ");
                }
            }

            System.out.println(answer);

/*            Optional<Map.Entry<Byte, Integer>> max = byteFrequency.entrySet().stream()
                    .max(Map.Entry.comparingByValue());

            List<Map.Entry<Byte, Integer>> mostFrequentBytes = byteFrequency.entrySet().stream()
                    .filter(entry -> entry.getValue().equals(max.get().getValue()))
                    .collect(Collectors.toList());

            mostFrequentBytes.forEach(entry -> System.out.print(entry.getKey() + " "));*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
