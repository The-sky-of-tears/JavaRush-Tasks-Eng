package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(0d, null);
        labels.put(1d, "1");
        labels.put(2d, "2");
        labels.put(3d, "3");
        labels.put(4d, "4");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
