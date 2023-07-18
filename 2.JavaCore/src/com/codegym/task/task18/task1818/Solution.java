package com.codegym.task.task18.task1818;

import java.io.*;
import java.util.Scanner;
/* 
Two in one

*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        String firstFileName;
        String secondFileName;
        String thirdFileName;

        try {
            firstFileName = in.nextLine();
            secondFileName = in.nextLine();
            thirdFileName = in.nextLine();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return;
        }

        try (BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream(firstFileName));
             BufferedInputStream secondBis = new BufferedInputStream
                     (new FileInputStream(secondFileName));
             BufferedInputStream thirdBis = new BufferedInputStream
                     (new FileInputStream(thirdFileName))) {

            byte[] buffer;
            if (secondBis.available() > 0) {
                buffer = new byte[secondBis.available()];
                secondBis.read(buffer, 0, buffer.length);
                bos.write(buffer);
            }

            if (thirdBis.available() > 0) {
                buffer = new byte[thirdBis.available()];
                thirdBis.read(buffer, 0, buffer.length);
                bos.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
