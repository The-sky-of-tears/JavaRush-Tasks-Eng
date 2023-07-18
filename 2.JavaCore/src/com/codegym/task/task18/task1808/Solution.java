package com.codegym.task.task18.task1808;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/* 
Splitting a file

*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstFileName = in.nextLine();
        String secondFileName = in.nextLine();
        String thirdFileName = in.nextLine();

        try (FileInputStream fis = new FileInputStream(firstFileName);
             FileOutputStream secondFos = new FileOutputStream(secondFileName);
             FileOutputStream thirdFos = new FileOutputStream(thirdFileName)) {

            if (fis.available() > 0) {
                byte[] secondBuffer = new byte[fis.available() / 2 + fis.available() % 2];
                byte[] thirdBuffer = new byte[fis.available() / 2];

                fis.read(secondBuffer, 0, secondBuffer.length);
                fis.read(thirdBuffer, 0, thirdBuffer.length);

                secondFos.write(secondBuffer);
                thirdFos.write(thirdBuffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
