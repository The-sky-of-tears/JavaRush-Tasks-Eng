package en.codegym.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Not all shall pass
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (Scanner in = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Path.of(in.nextLine()));

            for (int i = 0; i < lines.size(); i += 2) {
                System.out.println(lines.get(i));
            }
        }
    }
}

