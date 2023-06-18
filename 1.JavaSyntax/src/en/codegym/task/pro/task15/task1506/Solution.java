package en.codegym.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Face control
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Path.of(in.nextLine()));

            for (var line : lines) {
                for (Character symbol : line.toCharArray()) {
                    if (!symbol.equals('.') && !symbol.equals(',') && !symbol.equals(' ')) {
                        System.out.print(symbol);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

