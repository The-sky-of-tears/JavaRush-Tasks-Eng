package en.codegym.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 123;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {

        String result = "";

        if (decimalNumber > 0) {
            do {
               result = (decimalNumber % 2) + result;
            } while ((decimalNumber /= 2) > 0);
        }

        return result;
    }

    public static int toDecimal(String binaryNumber) {

        int result = 0;

        if (binaryNumber != null && binaryNumber.length() != 0 && !binaryNumber.equals("0")) {

            int rest = 0;
            int multiplier = 1;

            do {
                result += Character.getNumericValue(binaryNumber
                        .charAt(binaryNumber.length() - 1)) * multiplier;
                multiplier *= 2;
            } while (!(binaryNumber = binaryNumber.substring
                    (0, binaryNumber.length() - 1)).isEmpty());
        }

        return result;
    }
}
