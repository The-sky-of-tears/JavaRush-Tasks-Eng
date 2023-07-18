package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.*;
/* 
Threads and bytes

*/

public class Solution {
    public static final Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LinkedList<Thread> threads = new LinkedList<>();

        String key;

        while (!(key = console.nextLine()).equals("exit")) {
            threads.addLast(new ReadThread(key));
            threads.getLast().start();
        }

        threads.forEach((thread) -> {
            try {
             thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        });
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            Map.Entry<Byte, Integer> mostFrequentByte = getMostFrequentByte();

            synchronized (resultMap) {
                resultMap.put(fileName, Integer.valueOf(mostFrequentByte.getKey()));
            }
        }

        private Map.Entry<Byte, Integer> getMostFrequentByte() {
            TreeMap<Byte, Integer> symbolFrequency = new TreeMap<>();

            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {

                while (bis.available() > 0) {
                    Byte value = (byte) bis.read();

                    if (!symbolFrequency.containsKey(value)) {
                        symbolFrequency.put(value, 1);
                    } else {
                        symbolFrequency.replace(value, symbolFrequency.get(value) + 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }

            return symbolFrequency.entrySet().stream()
                    .max(Map.Entry.comparingByValue()).get();
        }
    }
}
