package com.codegym.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
AmigoOutputStream

*/

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream component;
    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream component) throws FileNotFoundException {
        super(fileName);
        this.component = component;
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
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void close() throws IOException {
        flush();
        write( "CodeGym © All rights reserved.".getBytes());
        component.close();
    }
}
