package en.codegym.task.pro.task17.task1705;

import java.util.ArrayList;

/* 
Space Odyssey Part 3
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        performWork();
    }

    public static void performWork() {
        astronauts.forEach(astronaut -> {
            if (astronaut instanceof Human) {
                pilot((Human) astronaut);
            } else if (astronaut instanceof Dog) {
                chartCourse((Dog) astronaut);
            } else if (astronaut instanceof Cat) {
                research((Cat) astronaut);
            }
        });
    }

    public static void pilot(Human human) {
        System.out.println("Crew member " + human.getInfo() + " is piloting the ship.");
    }

    public static void chartCourse(Dog dog) {
        System.out.println("Crew member " + dog.getInfo() + " is charting a course.");
    }

    public static void research(Cat cat) {
        System.out.println("Crew member " + cat.getInfo() + " is researching nearby planets.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("The following crew members are on board: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
