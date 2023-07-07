package com.codegym.task.task12.task1219;

/* 
Making a human

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanSwim, CanRun {
        public void swim() {}

        public void run() {}
    }

    public class Duck implements CanRun, CanFly, CanSwim {
        public void run() {}

        public void fly() {}

        public void swim() {}
    }

    public class Penguin implements CanSwim, CanRun {
        public void swim() {}

        public void run() {}
    }

    public class Airplane implements CanFly, CanRun {
        public void run() {}

        public void fly() {}
    }
}
