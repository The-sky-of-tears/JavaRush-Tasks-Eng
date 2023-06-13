package en.codegym.task.pro.task12.task1212;

import java.util.Arrays;
/* 
Creating our own list
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity *= 1.5;
        elements = Arrays.copyOf(elements, capacity);
    }
}
