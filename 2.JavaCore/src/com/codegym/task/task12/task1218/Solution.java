package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void eat() {

        }

        public void move() {

        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        public void eat() {

        }

        public void fly() {

        }

        public void move() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly{
        public void fly() {

        }

        public void move() {

        }
    }
}
