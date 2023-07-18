package com.codegym.task.task18.task1819;

/*
Combining files

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstFileName;
        String secondFileName;

        try {
            firstFileName = in.nextLine();
            secondFileName = in.nextLine();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return;
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (BufferedInputStream firstFileBis = new BufferedInputStream
                     (new FileInputStream(firstFileName));
             BufferedInputStream secondFileBis = new BufferedInputStream
                     (new FileInputStream(secondFileName))) {

            if (secondFileBis.available() > 0) {
                baos.write(secondFileBis.readAllBytes());
            }

            if (firstFileBis.available() > 0) {
                baos.write(firstFileBis.readAllBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try (BufferedOutputStream firstFileBos = new BufferedOutputStream
                (new FileOutputStream(firstFileName))) {

            firstFileBos.write(baos.toByteArray());

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
