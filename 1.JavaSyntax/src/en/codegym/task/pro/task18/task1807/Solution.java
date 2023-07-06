package en.codegym.task.pro.task18.task1807;

import java.util.ArrayList;
import java.util.Collections;

/* 
Farewell to foreach
*/

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        for(int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
