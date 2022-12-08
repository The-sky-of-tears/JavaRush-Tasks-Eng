package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

public class Solution {

    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "1ef";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {

        String result = "";

        if (binaryNumber != null && binaryNumber.length() != 0) {
            result = decimalToHex(binaryToDecimal(binaryNumber));
        }

        return result;
    }

    public static String toBinary(String hexNumber) {
       /* String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if (hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);
                ;
                break;
            }
            result.append(element);
        }
        return result.toString();*/
        String result = "";

        if (hexNumber != null && hexNumber.length() != 0) {

            result = decimalToBinary(hexToDecimal(hexNumber));

            while (result.length() % 4 != 0) {
                result = "0" + result;
            }
        }

        return result;
    }

    public static String decimalToHex(int decimalNumber) {

        String result = "";

        if (decimalNumber >= 0) {
            do {
                result = HEX.charAt(decimalNumber % 16) + result;
            } while((decimalNumber /= 16) > 0);
        }

        return result;
    }

    public static int hexToDecimal(String hexNumber) {
        int result = 0;

        if (hexNumber != null && hexNumber.length() != 0) {
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

    public static String decimalToBinary(int decimalNumber) {

        String result = "";

        if (decimalNumber >= 0) {
            do {
                result = (decimalNumber % 2) + result;
            } while ((decimalNumber /= 2) > 0);
        }

        return result;
    }

    public static int binaryToDecimal(String binaryNumber) {

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
