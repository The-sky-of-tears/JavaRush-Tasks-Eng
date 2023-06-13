package en.codegym.task.pro.task11.task1109;

/* 
Objects of inner and nested classes
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nester = new Outer.Nested();
    }
}
