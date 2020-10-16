package edu.pcc.cis.BinaryConversion;

import java.util.Scanner;
/**
 * create a Scanner user interface to try out binary conversion
 * This is part of the binary conversion program
 */
public class SystemConversion {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Conversions binaryConversion = new Conversions();
        System.out.println("This will convert a string of binary digits to their decimal equivalent.");
        System.out.println("Enter your 8 binary digits");
        String input = sc.nextLine();
        int ans = binaryConversion.binaryToDecimal(input);
        System.out.println(input + " in decimal is: " + ans);

    }
}
