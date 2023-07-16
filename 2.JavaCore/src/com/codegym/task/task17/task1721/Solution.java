package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstPath = in.nextLine();
        String secondPath = in.nextLine();

        readAllLines(firstPath, allLines);
        readAllLines(secondPath, linesForRemoval);

        try {
            Solution solution = new Solution();
            solution.joinData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readAllLines(String fileName, List<String> storage) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            while (bufferedReader.ready()) {
                storage.add(bufferedReader.readLine());

                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
