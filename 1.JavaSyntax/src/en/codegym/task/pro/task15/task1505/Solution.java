package en.codegym.task.pro.task15.task1505;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Something isn't being copied...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {

            byte[] buff = new byte[1024];
            while (inputStream.available() > 0) {
                int read = inputStream.read(buff);
                outputStream.write(buff, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}