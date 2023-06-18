package en.codegym.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
File or directory
*/

public class Solution {
    private static final String THIS_IS_FILE = " - This is a file";
    private static final String THIS_IS_DIR = " - This is a directory";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            Path path = Path.of(in.nextLine());

            if (Files.isRegularFile(path)) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(path)) {
                System.out.println(path + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}

