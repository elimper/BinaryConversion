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

        //catch cases where string is over one byte
        if(binary.length() > 8){
            return -1;
        }

        for(int i = 0; i < binary.length(); i++){
            if(binary.substring(i).startsWith("1")){
                decimal += values[i];
            }
        }
        return decimal;
    }
}
