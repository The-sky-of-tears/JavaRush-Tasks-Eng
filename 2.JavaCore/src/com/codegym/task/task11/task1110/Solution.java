package com.codegym.task.task11.task1110;

/* 
Don't forget to encapsulate

*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {

        private int age;
        private String name;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.speed = 0;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}
