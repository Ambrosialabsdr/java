/******************************************************************************
 * Program Name:          PreLab03 
 * Program Description:   This program helps my daughter check her math homework 
 *                        
 * Program Author:        Richard Ruiz
 * Date Created:          2/19/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ******************************************************************************/

package prelab03;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class PreLab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt user for input
        Scanner input = new Scanner(System.in);

// Define variables
        System.out.print(" Enter problem number ");
        byte probNum = input.nextByte();

// Determine if the prodNum is within established parameter
        if (probNum > 10 || probNum < 1) {

            System.out.print(" Problem number is outside range, program ending! ");
            System.exit(0);
        }

// Set PI as a constant
        final double PI = 3.14159;

        if (probNum % 2 == 0) {
            // Enter Radius of Circle
            System.out.print("Circle \n Enter Radius of Circle ");
            double radius = input.nextDouble();

            // Calculate the Area of a Circle
            double areaC = PI * Math.pow(radius, 2);
            System.out.println(" The Area of the Circle " + areaC);

        } else {

// Enter Length of Rectangle
            System.out.print("Rectangle \n Enter Length of Rectangle ");
            double lengthR = input.nextDouble();
// Enter Width of Rectangle 
            System.out.print(" Enter Width of Rectangle ");
            double widthR = input.nextDouble();

            // Compute area of rectangle
            double Area = lengthR * widthR;
            System.out.println("Area of Rectangle is " + Area);

        }

    }

}
