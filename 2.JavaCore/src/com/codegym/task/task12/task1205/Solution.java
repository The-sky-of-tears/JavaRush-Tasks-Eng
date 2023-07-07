package com.codegym.task.task12.task1205;

/* 
Animal identification

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String answer = "Unknown Animal";

        if (o instanceof Cow) {
            answer = "Cow";
        } else if (o instanceof Dog) {
            answer = "Dog";
        } else if (o instanceof Whale) {
            answer = "Whale";
        }

        return answer;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
