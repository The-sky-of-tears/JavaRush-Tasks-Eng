package en.codegym.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Getting information through an API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);

        try (OutputStream outputStream = conn.getOutputStream();
            PrintStream sender = new PrintStream(outputStream)) {

            sender.println("Hello Cruel World!");
        }

        try (InputStream inputStream = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}

