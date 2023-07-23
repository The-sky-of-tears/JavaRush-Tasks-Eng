package com.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

*/

public class Solution implements Serializable {
    public static void main(String[] args) throws Exception {
        try {
            File file = new File("test.txt");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file));

            Solution savedObject = new Solution(13);
            ous.writeObject(savedObject);

            Solution loadedObject = new Solution(666);
            loadedObject = (Solution) ois.readObject();

            if (savedObject.string.equals(loadedObject.string)) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
