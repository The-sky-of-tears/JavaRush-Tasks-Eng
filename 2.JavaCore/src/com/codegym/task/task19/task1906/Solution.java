package com.codegym.task.task19.task1906;

import java.io.*;
import java.util.Scanner;
/* 
Even characters

*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName;
        String secondFileName;

        try {
            firstFileName = console.readLine();
            secondFileName = console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


        try (BufferedReader br = new BufferedReader(new FileReader(firstFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(secondFileName))) {

            while (br.ready()) {
                br.read();

                if (br.ready()) {
                    bw.write(br.read());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
