package com.codegym.task.task18.task1810;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
/* 
DownloadException

*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        Scanner in = new Scanner(System.in);


        while (true) {
            String fileName = in.nextLine();

            try (FileInputStream fis = new FileInputStream(fileName)) {
                if (fis.available() < 1000) {
                    throw new DownloadException();
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

        }




    }

    public static class DownloadException extends Exception {

    }
}
