package com.codegym.task.task18.task1812;

import java.io.*;
import java.util.Scanner;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream component;

    public QuestionFileOutputStream(AmigoOutputStream component) {
        this.component = component;
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        Scanner in = new Scanner(System.in);
        String key;

        System.out.println("Do you really want to close the stream? Y/N");

        try {
            key = in.nextLine();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return;
        }

        if (key.equals("Y")) {
            component.close();
        }
    }
}

