package en.codegym.task.pro.task12.task1206;

/* 
Analyzing strings
*/

public class Solution {

    public static void main(String[] args) {
        String string = "I think this will be a new feature. " +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int counter = 0;

        for(var letter : string.toCharArray()) {
            if (Character.isDigit(letter)) {
                counter++;
            }
        }

        return counter;
    }

    public static int countLetters(String string) {
        int counter = 0;

        for(var letter : string.toCharArray()) {
            if (Character.isLetter(letter)) {
                counter++;
            }
        }

        return counter;
    }

    public static int countSpaces(String string) {
        int counter = 0;

        for(var letter : string.toCharArray()) {
            if (Character.isSpaceChar(letter)) {
                counter++;
            }
        }

        return counter;
    }
}
