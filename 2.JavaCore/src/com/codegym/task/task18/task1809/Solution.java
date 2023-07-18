package com.codegym.task.task18.task1809;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/* 
Reversing a file

*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstFileName = in.nextLine();
        String secondFileName = in.nextLine();

        try (FileInputStream fis = new FileInputStream(firstFileName);
             FileOutputStream fos = new FileOutputStream(secondFileName)){

            ArrayList<Byte> buf = new ArrayList<>();

            while (fis.available() > 0) {
                buf.add((byte) fis.read());
            }

            Collections.reverse(buf);
            for (Byte value : buf) {
                fos.write(value);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
