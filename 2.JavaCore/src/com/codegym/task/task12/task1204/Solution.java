package com.codegym.task.task12.task1204;

/* 
Whether it's a bird or a lamp

*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o.getClass().equals(Cat.class)) {
            System.out.println("Cat");
        } else if (o.getClass().equals(Bird.class)) {
            System.out.println("Bird");
        } else if (o.getClass().equals((Lamp.class))) {
            System.out.println("Lamp");
        } else if (o.getClass().equals(Dog.class)) {
            System.out.println("Dog");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
