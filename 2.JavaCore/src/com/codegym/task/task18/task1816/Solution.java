package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int counter = 0;

        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char letter = (char) fileReader.read();
                if (Character.isLetter(letter)) {
                    counter++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(counter);
    }
}
