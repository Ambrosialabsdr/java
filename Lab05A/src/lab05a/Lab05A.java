/** ****************************************************************************
 * Program Name:          Lab05A
 * Program Description: This program identifies ISBN numbers as strings
 *
 * Program Author:        Richard Ruiz
 * Date Created:          3/19/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ***************************************************************************** */
package lab05a;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class Lab05A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Enter the first 9 or 12-digits of an ISBN number. Enter QUIT to exit:");
        Scanner input = new Scanner(System.in);
        // collect input of type string
        String isbn = input.next();
        // Because a string is a reference type do not use == or !=
        String output10 = "";
        String output13 = "";
        while (!isbn.equalsIgnoreCase("QUIT")) {
            char checkDigit = 0;
            int checkSum = 0;
            if (isbn.length() == 9) {
                int sum = 0;
                for (int i = 0; i < isbn.length(); i++) {
                    sum = sum + ((isbn.charAt(i) - '0') * (i + 1));
                }
                if (sum % 11 == 10) {
                    checkDigit = 'X';
                } else {
                    checkDigit = (char) ('0' + (sum % 11));
                }
                output10 = output10 + "\n" + isbn + checkDigit;
                System.out.println(" Enter the first 9 or 12-digits of an ISBN number. Enter QUIT to exit:");
                isbn = input.next();
            } // Because we are working with the same variable, use "else if" statement
            else if (isbn.length() == 12) {
                int sum = 0;
                for (int i = 0; i < isbn.length(); i++) {
                    if (i % 2 == 0) {
                        sum = sum + (isbn.charAt(i) - '0');
                    } else {
                        sum = sum + (isbn.charAt(i) - '0') * 3;
                    }
                }
                checkSum = 10 - (sum % 10);
                if (checkSum == 10) {
                    checkSum = 0;
                }
                output13 = output13 + "\n" + isbn + checkSum;

                System.out.println(" Enter the first 9 or 12-digits of an ISBN number. Enter QUIT to exit:");
                isbn = input.next();

            } else {
                System.out.println(isbn + " is an invalid input. Enter the first 9 or 12-digits of an ISBN number. Enter QUIT to exit:");
                isbn = input.next();
            }
        }

        System.out.println("The ISBN-10 numbers are: " + output10 + "\n");
        System.out.println("The ISBN-13 numbers are: " + output13 + "\n");

    }

}
