package en.codegym.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int cornerCount) {
        return switch (cornerCount) {
            case 3 -> "Triangle";
            case 4 -> "Quadrangle";
            case 5 -> "Pentagon";
            case 6 -> "Hexagon";
            case 7 -> "Heptagon";
            case 8 -> "Octagon";
            default -> "Other shape";
        };
    }
}
