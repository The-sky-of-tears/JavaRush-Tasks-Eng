package en.codegym.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Mixed-up bytes
*/

public class Solution {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in);
             var firstFileIn = Files.newInputStream(Path.of(in.nextLine()));
             var secondFileOut = Files.newOutputStream(Path.of(in.nextLine()))){

            while (firstFileIn.available() > 0) {
                int evenByte = firstFileIn.read();
                int oddByte = firstFileIn.read();

                if (oddByte != -1) {
                    secondFileOut.write(oddByte);
                    secondFileOut.write(evenByte);
                } else {
                    secondFileOut.write(evenByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

