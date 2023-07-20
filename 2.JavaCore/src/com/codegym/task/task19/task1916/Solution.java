package com.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Tracking changes

*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) {

        String firstFileName;
        String secondFileName;

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = console.readLine();
            secondFileName = console.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

        ArrayList<String> linesFromFirst = new ArrayList<>();
        ArrayList<String> linesFromSecond = new ArrayList<>();

        try (BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFileName));
             BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFileName))) {

            while (firstFileReader.ready()) {
                linesFromFirst.add(firstFileReader.readLine());
            }

            while(secondFileReader.ready()) {
                linesFromSecond.add(secondFileReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

        int i = 0;
        int j = 0;

        while (i < linesFromFirst.size() || j < linesFromSecond.size()) {

            if ( i < linesFromFirst.size() && j < linesFromSecond.size() &&
                    linesFromFirst.get(i).equals(linesFromSecond.get(j))) {

                lines.add(new LineItem(Type.SAME, linesFromFirst.get(i)));
                i++;
                j++;

            } else if (i < linesFromFirst.size() &&
                    !linesFromSecond.contains(linesFromFirst.get(i))) {

                lines.add(new LineItem(Type.REMOVED, linesFromFirst.get(i)));
                i++;

            } else if (j < linesFromSecond.size() &&
                    !linesFromFirst.contains(linesFromSecond.get(j))) {

                lines.add(new LineItem(Type.ADDED, linesFromSecond.get(j)));
                j++;
            }
        }

        /*lines.forEach(System.out::println);*/
        System.out.println(lines);
    }

    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return String.format("LineItem{%s - %s}", type, line);
        }
    }
}
