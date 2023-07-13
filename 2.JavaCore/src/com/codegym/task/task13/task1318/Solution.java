package com.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fis = new  FileInputStream(in.readLine());

            StringBuilder result  = new StringBuilder();
            while (fis.available() > 0) {
                result.append((char)fis.read());
            }

            System.out.println(result);

            fis.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}