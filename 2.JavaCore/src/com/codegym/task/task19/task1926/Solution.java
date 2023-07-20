package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.*;

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

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            br.lines().forEach(line -> {
                System.out.println(new StringBuilder(line).reverse());
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            console.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
