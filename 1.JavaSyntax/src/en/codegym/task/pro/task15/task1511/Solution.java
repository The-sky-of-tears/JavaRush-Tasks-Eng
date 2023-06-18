package en.codegym.task.pro.task15.task1511;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Writing characters to a file
*/

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             var bufferedWriter =  Files.newBufferedWriter(Path.of(scanner.nextLine()))) {

            bufferedWriter.write(chars);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


