package en.codegym.task.pro.task08.task0814;

/* 
Flags
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        //write your code here
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        //write your code here
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //write your code here
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
