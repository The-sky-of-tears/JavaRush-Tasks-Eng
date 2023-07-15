package com.codegym.task.task16.task1632;

import java.io.*;
import java.util.*;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread first = new Thread(() -> {
            while(true) {

            }
        });

        Thread second = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                    break;
                }
            }
        });

        Thread third = new Thread(() -> {
            while (true) {
                System.out.println("Hurray");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread fourth = new Fourth();

        Thread fifth = new Thread(() -> {
            Scanner in = new Scanner(System.in);

            int sum = 0;

            while (true) {
                String key = in.nextLine();
                if (key.equals("N")) {
                    System.out.println(sum);
                    break;
                } else {
                    sum += Integer.parseInt(key);
                }
            }
        });

        Collections.addAll(threads, first, second, third, fourth, fifth);
    }

    public static void main(String[] args) {

    }

    public static class Fourth extends Thread implements Message {

        @Override
        public void showWarning() {
            interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }
    }
}