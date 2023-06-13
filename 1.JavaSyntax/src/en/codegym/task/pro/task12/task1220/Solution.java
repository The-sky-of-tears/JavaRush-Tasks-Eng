package en.codegym.task.pro.task12.task1220;

import java.util.ArrayList;

/* 
Chasing after types
*/

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Hello");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (var element : elements) {
            if (element instanceof String) {
                printString();
            } else if (element instanceof Integer) {
                printInteger();
            } else if (element instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("String");
    }

    public static void printInteger() {
        System.out.println("Integer");
    }

    public static void printIntegerArray() {
        System.out.println("Array of integers");
    }

    public static void printUnknown() {
        System.out.println("Other data type");
    }
}
