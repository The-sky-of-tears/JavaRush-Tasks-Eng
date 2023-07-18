package com.codegym.task.task18.task1801;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/* 
Maximum byte

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

            ArrayList<Byte> bytes = new ArrayList<>();

            while (fis.available() > 0) {
                bytes.add((byte) fis.read());
            }

            System.out.println(bytes.stream().max(Byte::compareTo).get());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
