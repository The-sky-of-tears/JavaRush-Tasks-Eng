package en.codegym.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Student performance
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        for (int i = 0; i < 5; i++) {
            grades.put("Name" + i, (double)(i));
        }
    }
}
