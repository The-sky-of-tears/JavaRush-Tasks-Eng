package com.codegym.task.task18.task1827;


import java.io.*;
import java.util.Scanner;
/* 
Prices

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        Scanner in = new Scanner(System.in);

        String fileName = in.nextLine();
        int maxId = Integer.MIN_VALUE;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){

            String productLine;
            int productId;
            while (br.ready()) {
                productLine = br.readLine();
                productId = Integer.parseInt(productLine.substring(0, 8)
                        .replaceAll(" ", ""));

                if (maxId < productId) {
                    maxId = productId;
                }

                baos.write((productLine + "\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try (BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream(fileName))) {

            bos.write(baos.toByteArray());

            String newProduct = String.format("%-8s%-30s%-8s%-4s", maxId + 1, args[1], args[2], args[3]);

            bos.write(newProduct.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
