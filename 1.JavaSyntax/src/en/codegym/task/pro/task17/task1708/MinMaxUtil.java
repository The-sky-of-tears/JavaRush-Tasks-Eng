package en.codegym.task.pro.task17.task1708;

/* 
Minimum and maximum
*/

public class MinMaxUtil {
    public static int min(int first, int second) {
        return Math.min(first, second);
    }

    public static int min(int first, int second, int third) {
        return Math.min(Math.min(first, second), third);
    }

    public static int min(int first, int second, int third, int fourth) {
        return Math.min(Math.min(Math.min(first, second), third), fourth);
    }

    public static int min(int first, int second, int third, int fourth, int fifth) {
        return Math.min(Math.min(Math.min(Math.min(first, second), third), fourth), fifth);
    }


    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(Math.max(Math.max(first, second), third), fourth);
    }

    public static int max(int first, int second, int third, int fourth, int fifth) {
        return Math.max(Math.max(Math.max(Math.max(first, second), third), fourth), fifth);
    }





}
