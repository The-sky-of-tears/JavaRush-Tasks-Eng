package en.codegym.task.pro.task09.task0905;

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {

        int result = 0;

        if (decimalNumber > 0) {

            int multiplier = 1;

            do {
                result += decimalNumber % 8 * multiplier;
                multiplier *= 10;
            } while ((decimalNumber /= 8) > 0);
        }

        return result;
    }

    public static int toDecimal(int octalNumber) {

        int result = 0;

        if (octalNumber > 0) {

            int multiplier = 1;

            do {
                result += octalNumber % 10 * multiplier;
                multiplier *= 8;
            } while ((octalNumber /= 10) > 0);
        }

        return result;
    }
}
