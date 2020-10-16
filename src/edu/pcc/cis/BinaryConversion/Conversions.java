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
     * @param binary a string of zeroes and ones
     * @return an int representation of the binary string or -1 if an error
     */
    public int binaryToDecimal(String binary)
    {
        int decimal = 0;
        int[] values = {128, 64, 32, 16, 8, 4, 2, 1};

        if(!isByteString(binary)){
            return -1;
        }

        for(int i = 0; i < binary.length(); i++){
            if(binary.substring(i).startsWith("1")){
                decimal += values[i];
            }
        }
        return decimal;
    }

    /**
     * Checks if a given string is a byte value.
     * @param binary a string of 0 and 1
     * @return true if the string meets the criteria
     */
    private boolean isByteString(String binary)
    {
        boolean testLength;
        //catch cases where string is not 8 digits
        if(binary.length() == 8) {
            testLength = true ;
        }
        else{
            return false;
        }
        boolean testDigits;
        int checksum = 0;
        //checks if each digit is a 0 or 1
        for (int i = 0; i <8 ; i ++) {
            if (binary.charAt(i) == '0' || binary.charAt(i) == '1') {
                checksum++;
            }
        }
        if (checksum == 8){
            testDigits = true;
        }
        else{
            return false;
        }
        return testDigits && testLength;
    }
}
