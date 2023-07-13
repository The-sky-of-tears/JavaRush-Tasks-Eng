package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try (Scanner scanner = new Scanner(new FileInputStream(in.nextLine()))) {

            ArrayList<Integer> numbers = new ArrayList<>();

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            numbers.stream()
                    .filter(number -> number % 2 == 0)
                    .sorted()
                    .forEach(System.out::println);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
