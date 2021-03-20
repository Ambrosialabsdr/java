/*
/** ****************************************************************************
 * Program Name:          PreLab04
 * Program Description:   Performs operations with various I/O parameters
 *
 * Program Author:        Richard Ruiz
 * Date Created:          3/01/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ***************************************************************************** */
package prelab04;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class PreLab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Use the Switch method to calculate a day of the week
        System.out.print("Please enter an integer for the day of the week (0-6):  ");
        int day = input.nextInt();

        switch (day % 7) {
            case 0:
                System.out.println("0 is Sunday\n");
                break;
            case 1:
                System.out.println(" 1 is Monday\n");
                break;
            case 2:
                System.out.println("2 is Tuesday\n");
                break;
            case 3:
                System.out.println("3 is Wednesday\n");
                break;
            case 4:
                System.out.println("4 is Thursday\n");
                break;
            case 5:
                System.out.println("5 is Friday\n");
                break;
            case 6:
                System.out.println("6 is Saturday\n");
                break;
        }
        // Calculate the min. and the max given 2 integers
        System.out.println("Please enter two numbers for max and min: ");
        double int1 = input.nextDouble();
        double int2 = input.nextDouble();
        Math.max(int1, int2);

        System.out.println(("The maximum is ") + Math.max(int1, int2) + (" and the minumum is ") + Math.min(int1, int2));

// Calculate the square root of a number
        System.out.print("Please enter a number to be square-rooted:  ");
        double a = input.nextDouble();
        Math.sqrt(a);
        System.out.println("The square root of " + a + " is " + Math.sqrt(a));

        // Calculate an exponent given a base and a power       
        System.out.print("Please enter a base:  ");
        double base = input.nextDouble();
        System.out.print("Please enter a power:  ");
        double power = input.nextDouble();
        System.out.println("The base " + base + " raised to the power of " + power
                + " rounded to the nearest whole number, is " + (int) Math.pow(base, power));

        // Cast a numeric type into into a char type ( letter)
        // skip cannot do it
        System.out.print("Please enter an integer between 1-26: ");
        int c = (int) 3;
        System.out.println(c);
        // System.out.println("Please enter a lower case character: ");
        //char lowerCase = input.next().charAt(0); to receive lowercase char
//Couldn't do it 
        //System.out.println("Please enter a lower case character: " + Character.toLowerCase(E));
        //String E = new String("UPPERCASE CONVERTED TO LOWERCASE");
        //Convert to LowerCase
        //System.out.println(E.toLowerCase());
        
        
        
    }
}
