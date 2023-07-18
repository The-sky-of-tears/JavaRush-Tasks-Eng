package com.codegym.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/* 
Prices 2

*/

public class Solution {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        Scanner console = new Scanner(System.in);

        String fileName = console.nextLine();
        String key = args[0];
        ArrayList<Product> products = readFile(fileName);

        switch (key) {
            case "-u":
                StringBuilder productName = new StringBuilder();
                for (int i = 2; i < args.length - 2; i++) {
                    productName.append(args[i]).append(" ");
                }

                Product toUpdate = new Product(args[1], productName.toString(),
                        args[args.length - 2], args[args.length - 1]);

                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getId().equals(toUpdate.getId())) {
                        products.set(i, toUpdate);
                        break;
                    }
                }
                break;
            case "-d":
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getId().equals(args[1])) {
                        products.remove(i);
                        break;
                    }
                }
                break;
        }

        writeToFile(products, fileName);
    }

    private static ArrayList<Product> readFile(String fileName) {
        ArrayList<Product> result = null;

        try (BufferedReader bf = new BufferedReader(new FileReader(fileName))) {

            result = new ArrayList<>();

            while(bf.ready()) {
                Product newProduct = new Product(bf.readLine());
                result.add(newProduct);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private static void writeToFile(ArrayList<Product> products, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            for (Product product : products) {
                bw.write(product.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}

class Product {
    private String id;
    private String productName;
    private String price;
    private String quantity;

    public Product(String id, String productName, String price, String quantity) {
        this(String.format("%-8s%-30s%-8s%-4s\n", id, productName, price, quantity));
    }

    public Product(String product) {
        StringBuilder productBuilder = new StringBuilder(product);
        while (productBuilder.length() < 50) {
            productBuilder.append(" ");
        }
        product = productBuilder.toString();

        this.id = product.substring(0, 8).trim();
        this.productName = product.substring(8, 38).trim();
        this.price = product.substring(38, 46).trim();
        this.quantity = product.substring(46,50).trim();
    }

    @Override
    public String toString() {
        return String.format("%-8s%-30s%-8s%-4s\n", id, productName, price, quantity);
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }
}
