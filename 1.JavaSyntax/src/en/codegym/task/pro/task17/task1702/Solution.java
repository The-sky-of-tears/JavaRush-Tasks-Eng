package en.codegym.task.pro.task17.task1702;

/* 
Geometry for dummies
*/

public class Solution {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();

        Shape.testFoo();
        Circle.testFoo();
    }
}
