package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 0;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {

        String result = "";

        if (decimalNumber > 0) {
            do {
                result = HEX.charAt(decimalNumber % 16) + result;
            } while((decimalNumber /= 16) > 0);
        }

        return result;
    }

    public static int toDecimal(String hexNumber) {
        int result = 0;

        if (hexNumber != null && hexNumber.length() != 0 && !hexNumber.equals("0")) {
            int multiplier = 1;

            do {
                result  += Character.getNumericValue(hexNumber.
                        charAt(hexNumber.length() - 1)) * multiplier;
                multiplier *= 16;
            } while (!(hexNumber = hexNumber.substring
                    (0, hexNumber.length() - 1)).isEmpty());
        }

        return result;
    }
}
