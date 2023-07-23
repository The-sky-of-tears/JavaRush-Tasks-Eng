package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Properties;

/* 
Introducing properties

*/

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {

        try (Scanner console = new Scanner(System.in);
             InputStream inputStream = new FileInputStream(console.nextLine())) {

            load(inputStream);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties propsToFile = new Properties();

        properties.forEach(propsToFile::setProperty);

        propsToFile.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        Properties propsFromFile = new Properties();

        propsFromFile.load(inputStream);

        propsFromFile.forEach((key, value) -> properties.put(key.toString(), value.toString()));
    }

    public static void main(String[] args) {

    }
}
