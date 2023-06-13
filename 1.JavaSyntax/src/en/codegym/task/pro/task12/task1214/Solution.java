package en.codegym.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Farewell, Pascal
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
    }
}
