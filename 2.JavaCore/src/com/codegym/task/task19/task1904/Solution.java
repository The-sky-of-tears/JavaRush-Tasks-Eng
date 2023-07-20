package com.codegym.task.task19.task1904;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) throws IOException {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String personRow = fileScanner.nextLine();
            String[] params = personRow.split(" ");
            Person newPerson = new Person(params[2], params[0], params[1],
                    new Date(Integer.parseInt(params[5]) - 1900,
                            Integer.parseInt(params[3]) - 1, Integer.parseInt(params[4])));

            System.out.println(newPerson);

            return newPerson;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
