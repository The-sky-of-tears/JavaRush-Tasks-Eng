package com.codegym.task.task12.task1225;

/* 
Visitors

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String animalType = null;

        if (o instanceof Tiger) {
            animalType = "Tiger";
        } else if (o instanceof Lion) {
            animalType = "Lion";
        } else if (o instanceof Cat) {
            animalType = "Cat";
        } else if (o instanceof Bull) {
            animalType = "Bull";
        } else if (o instanceof Cow) {
            animalType = "Cow";
        } else {
            animalType = "Animal";
        }

        return animalType;
    }

    public static class Cat extends Animal   // <-- Class inheritance!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
