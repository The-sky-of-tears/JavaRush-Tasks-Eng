package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> fileNames = new ArrayList<>();
        String fileName;
        String resultFileName;

        while (!(fileName = console.nextLine()).equals("end")) {
            fileNames.add(fileName);
        }
        resultFileName = fileNames.get(0).substring(0, fileNames.get(0).indexOf(".part"));

        Collections.sort(fileNames);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream(resultFileName))) {

            byte[] buffer;
            for(String currentFileName : fileNames) {

                BufferedInputStream bis = new BufferedInputStream
                        (new FileInputStream(currentFileName));

                buffer = new byte[bis.available()];
                bis.read(buffer);

                baos.write(buffer);

                bis.close();
            }

            bos.write(baos.toByteArray());
            baos.close();

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


    }
}
