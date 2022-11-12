package en.codegym.task.pro.task07.task0707;

/* 
5 shades of char
*/

public class Solution {
    public static char char1 = 101;         // e
    public static char char2 = 'H';
    public static char char3 = 114;         //r
    public static char char4 = '\u006F';    //o
    public static char char5 = 108;         //l
    public static char char6 = 'h';
    public static char char7 = 0x0063;      //c
    public static char char8 = ' ';
    public static char char9 = 'l';
    public static char char10 = 0x61;       //a

    public static void main(String[] args) {
        System.out.print(char2);            //H
        System.out.print(char1);            //e
        System.out.print(char9);            //l
        System.out.print(char9);            //l
        System.out.print(char4);            //o
        System.out.print(char8);            //' '
        System.out.print(char7);            //c
        System.out.print(char6);            //h
        System.out.print(char10);           //a
        System.out.print(char3);            //r
        System.out.println();
    }
}
