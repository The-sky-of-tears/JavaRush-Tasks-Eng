package com.codegym.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String fileName;

        try {
            fileName = in.nextLine();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return;
        }

        try (FileInputStream fis = new FileInputStream(fileName)) {

            TreeSet<Byte> byteSet = new TreeSet<>();

            while (fis.available() > 0) {
                byteSet.add((byte) fis.read());
            }

            StringBuilder answer = new StringBuilder();
            byteSet.forEach(element -> answer.append(element).append(" "));
            System.out.println(answer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
