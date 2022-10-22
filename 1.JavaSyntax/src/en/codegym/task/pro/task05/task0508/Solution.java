package en.codegym.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Remove duplicate strings
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arraySize = 6;

        strings = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            strings[i] = in.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] != null && strings[i].equals(strings[j])) {
                    strings[j] = null;
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
