package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader(args[0]))) {

            bufferedReader.lines().forEach(line -> {
                Pattern dateRegex = Pattern.compile("\\d+ \\d+ \\d+");
                Matcher dateMatcher = dateRegex.matcher(line);

                Pattern nameRegex = Pattern.compile("[a-zA-Z-\\s]+\\D");
                Matcher nameMatcher = nameRegex.matcher(line);

                if (nameMatcher.find() && dateMatcher.find()) {
                    String[] tempDate = dateMatcher.group().split("\\s");
                    int year = Integer.parseInt(tempDate[2]) - 1900;
                    int month = Integer.parseInt(tempDate[0]) - 1;
                    int day = Integer.parseInt(tempDate[1]);

                    String name = nameMatcher.group().trim();

                    PEOPLE.add(new Person(name, new Date(year, month, day)));
                }
            });

           /* PEOPLE.forEach(System.out::println);*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
