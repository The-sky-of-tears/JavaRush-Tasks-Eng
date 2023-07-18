package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fileName = console.nextLine();
        Integer searchProductID = Integer.parseInt(args[0]);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){

            String product;
            while (br.ready()) {
                product = br.readLine();
                if (product.startsWith(searchProductID + " ")) {
                    System.out.println(product);
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
