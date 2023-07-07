package com.codegym.task.task12.task1224;

/* 
Unknown animal

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String animalType = null;

        if (o instanceof Cat) {
            animalType = "Cat";
        } else if (o instanceof Tiger) {
            animalType = "Tiger";
        } else if (o instanceof Lion) {
            animalType = "Lion";
        } else if (o instanceof Bull) {
            animalType = "Bull";
        } else {
            animalType = "Animal";
        }

        return animalType;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
