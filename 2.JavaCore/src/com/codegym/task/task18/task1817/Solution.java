package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        int spaceCounter = 0;
        int charCounter = 0;

        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char letter = (char) fileReader.read();
                charCounter++;

                if (letter == ' ') {
                    spaceCounter++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.printf("%.2f", (float) spaceCounter / charCounter * 100);
    }
}
