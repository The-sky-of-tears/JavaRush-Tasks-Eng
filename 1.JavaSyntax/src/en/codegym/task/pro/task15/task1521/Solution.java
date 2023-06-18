package en.codegym.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Saving a temporary file
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        URL url = new URL(line);
        try (InputStream input = url.openStream()) {
            byte[] buffer = input.readAllBytes();
            Path tempFilePath = Files.createTempFile(null, null);
            Files.write(tempFilePath, buffer);
        }
    }
}