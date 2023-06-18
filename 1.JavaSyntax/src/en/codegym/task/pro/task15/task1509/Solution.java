package en.codegym.task.pro.task15.task1509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/* 
Reading from the console once again
*/

public class Solution {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            String line = in.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

