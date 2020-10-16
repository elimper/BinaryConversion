package edu.pcc.cis.BinaryConversion;

/**
 * A conversion function for changing from binary to decimal
 *
 * @author Eli Limper
 * @version 10/16/2020
 */
public class Conversions {
    /**
     * Converts a string of 8 0s and 1s to decimal notation
     *
     * @param binary a string of zeroes and ones
     * @return an int representation of the binary string or -1 if an error
     */
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int[] values = {128, 64, 32, 16, 8, 4, 2, 1};

        if (!isByteString(binary)) {
            return -1;
        }

        for (int i = 0; i < binary.length(); i++) {
            if (binary.substring(i).startsWith("1")) {
                decimal += values[i];
            }
        }
        return decimal;
    }

    /**
     * Checks if a given string is a byte value.
     *
     * @param binary a string of 0 and 1
     * @return true if the string meets the criteria
     */
    private boolean isByteString(String binary) {
        boolean testLength;
        //catch cases where string is not 8 digits
        if (binary.length() == 8) {
            testLength = true;
        } else {
            return false;
        }
        boolean testDigits;
        int checksum = 0;
        //checks if each digit is a 0 or 1
        for (int i = 0; i < 8; i++) {
            if (binary.charAt(i) == '0' || binary.charAt(i) == '1') {
                checksum++;
            }
        }
        if (checksum == 8) {
            testDigits = true;
        } else {
            return false;
        }
        return testDigits && testLength;
    }

    /**
     * Converts an integer in decimal form to a string
     *  showing the number in binary.
     *
     * @param decimal a number up to 255
     * @return A string of 0s and 1s
     */
    public String convertToBinary(int decimal) {
        String binary = "00000000";
        //subtract from number up to 255
            if(decimal >255)
                return"Can only accommodate numbers up to 255.";

            while(decimal >0)

        {
            if (decimal >= 128) {
                binary = "1" + binary.substring(1);
                decimal -= 128;
            }
            if (decimal >= 64) {
                binary = binary.substring(0, 1) + "1" + binary.substring(2);
                decimal -= 64;
            }
            if (decimal >= 32) {
                binary = binary.substring(0, 2) + "1" + binary.substring(3);
                decimal -= 32;
            }
            if (decimal >= 16) {
                binary = binary.substring(0, 3) + "1" + binary.substring(4);
                decimal -= 16;
            }
            if (decimal >= 8) {
                binary = binary.substring(0, 4) + "1" + binary.substring(5);
                decimal -= 8;
            }
            if (decimal >= 4) {
                binary = binary.substring(0, 5) + "1" + binary.substring(6);
                decimal -= 4;
            }
            if (decimal >= 2) {
                binary = binary.substring(0, 6) + "1" + binary.substring(7);
                decimal -= 2;
            }
            if (decimal >= 1) {
                binary = binary.substring(0, 7) + "1";
                decimal -= 1;
            }
        }
            return binary;
    }
}
