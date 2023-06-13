package en.codegym.task.pro.task11.task1128;

/* 
Digits as text
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        result = switch (digit) {
            case '0' -> "zero";
            case '1' -> "one";
            case '2' -> "two";
            case '3' -> "three";
            case '4' -> "four";
            case '5' -> "five";
            case '6' -> "six";
            case '7' -> "seven";
            case '8' -> "eight";
            case '9' -> "nine";
            default -> "";
        };

        return result;
    }
}
