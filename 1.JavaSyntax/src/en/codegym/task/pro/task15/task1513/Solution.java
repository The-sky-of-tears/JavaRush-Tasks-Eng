package en.codegym.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Get to the root cause
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        System.out.println(path.getRoot());
    }
}

