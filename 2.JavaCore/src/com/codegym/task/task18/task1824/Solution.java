package com.codegym.task.task18.task1824;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/* 
Files and exceptions

*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fileName;

        while (true) {
            fileName = console.nextLine();

            try (FileInputStream fis = new FileInputStream(fileName)) {
                /*
                *
                * */
            } catch (IOException e) {
                if (e instanceof FileNotFoundException) {
                    System.out.println(fileName);
                    return;
                }
            }
        }
    }
}
