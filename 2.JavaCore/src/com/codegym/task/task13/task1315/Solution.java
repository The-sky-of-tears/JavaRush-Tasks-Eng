package com.codegym.task.task13.task1315;

/* 
Tom, Jerry and Spike

*/

public class Solution {
    public static void main(String[] args) {

    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void eat() {}

        @Override
        public void move() {}
    }

    public class Cat implements CanEat, CanMove, Edible {
        @Override
        public void eat() {}

        @Override
        public void move() {}

        @Override
        public void beEaten() {

        }
    }

    public class Mouse implements Edible, CanMove {
        @Override
        public void beEaten() {}

        @Override
        public void move() {}
    }
}