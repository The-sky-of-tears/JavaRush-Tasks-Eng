package com.codegym.task.task19.task1918;

/* 
Introducing tags

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {

    static HashSet<Integer> openTagsIndex = new HashSet<>();
    static HashSet<Integer> closeTagsIndex = new HashSet<>();
    static String openTag;
    static String closeTag;
    static StringBuilder answer = new StringBuilder();
    static StringBuilder fileContent = new StringBuilder();

    public static void main(String[] args) {

        openTag = String.format("<%s", args[0]);
        closeTag = String.format("</%s>", args[0]);

        String fileName;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                fileContent.append(fileReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

/*        System.out.println(fileContent);*/

        int nextIndex = 0;
        while (fileContent.indexOf(openTag, nextIndex) != -1) {
            openTagsIndex.add(fileContent.indexOf(openTag, nextIndex));
            nextIndex = fileContent.indexOf(openTag, nextIndex) + 1;
        }

        nextIndex = 0;
        while (fileContent.indexOf(closeTag, nextIndex) != -1) {
            closeTagsIndex.add(fileContent.indexOf(closeTag, nextIndex));
            nextIndex = fileContent.indexOf(closeTag, nextIndex) + 1;
        }

/*        System.out.println(openTagsIndex);
        System.out.println(closeTagsIndex);*/

        Stack<Integer> notClosedTagIndex = new Stack<>();
        Stack<String> tempStack = new Stack<>();
        for (int i = 0; i < fileContent.length(); i++) {
            if (openTagsIndex.contains(i)) {
                notClosedTagIndex.add(i);
            }

            if (closeTagsIndex.contains(i)) {
                if (notClosedTagIndex.size() > 1) {
                    tempStack.add(fileContent.substring(notClosedTagIndex.pop(),
                            i + closeTag.length()) + "\n");
                } else {
                    answer.append(fileContent.substring(notClosedTagIndex.pop(),
                            i + closeTag.length())).append("\n");

                    while (!tempStack.isEmpty()) {
                        answer.append(tempStack.pop());
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
