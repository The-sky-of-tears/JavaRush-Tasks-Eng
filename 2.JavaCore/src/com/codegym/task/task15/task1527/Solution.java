package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();
        String[] paramsOfUrl = url.substring(url.indexOf("?") + 1).split("&");
        List<String> importantParams = new ArrayList<>();

        Arrays.stream(paramsOfUrl).forEach(parameter -> {
            if (parameter.contains("=")) {
                System.out.print(parameter.substring(0, parameter.indexOf("=")) + " ");
            } else {
                System.out.print(parameter + " ");
            }

            if (parameter.contains("obj")) {
                importantParams.add(parameter);
            }
        });

        importantParams.forEach(parameter -> {
            String paramValue = parameter.substring(4);

            try {
                alert(Double.parseDouble(paramValue));
            } catch (Exception e) {
                alert(paramValue);
            }
        });
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
