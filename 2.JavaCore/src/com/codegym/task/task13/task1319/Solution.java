package com.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Writing to a file from the console

*/

public class Solution {
    private static BufferedWriter bufferedWriter;
    private static BufferedReader bufferedReader;
    public static void main(String[] args) {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<String> lines = null;
        try {
            lines = readAllLines();
            writeAllLines(lines);

            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<String> readAllLines() throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        String line = new String();

        while(!line.equals("exit")) {
            line = bufferedReader.readLine();
            lines.add(line);
        }

        return lines;
    }

    private static void writeAllLines(ArrayList<String> lines) {
        lines.forEach(line -> {
            try {
                bufferedWriter.write(line + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
