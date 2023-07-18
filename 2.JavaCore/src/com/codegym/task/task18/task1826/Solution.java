package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String key = args[0];

        switch (key) {
            case "-e":
                encrypt(args[1], args[2]);
                break;
            case "-d":
                decrypt(args[1], args[2]);
                break;
        }
    }

    private static void encrypt(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            while (fis.available() > 0) {
                fos.write(fis.read() + 13);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static void decrypt(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            while (fis.available() > 0) {
                fos.write(fis.read() - 13);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
