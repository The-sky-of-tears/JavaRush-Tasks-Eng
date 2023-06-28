package en.codegym.task.pro.task17.task1716;

/* 
Road traffic
*/

public interface Vehicle {
    default void start() {
        System.out.println("I'm starting to move.");
    }
    void move();
    default void stop() {
        System.out.println("I'm stopping.");
    }
}
