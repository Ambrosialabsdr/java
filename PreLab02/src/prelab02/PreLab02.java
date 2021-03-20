/** ****************************************************************************
 * Program Name:          PreLab02
 * Program Description:   This program calculates the volumes of two different
 * sized cones and then reports the difference in volumes as a positive number.
 *
 * Program Author:        Richard Ruiz
 * Date Created:          02/15/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 * 
 ***************************************************************************** */
package prelab02;

import java.util.Scanner; // Scanner is in the java.util package

/**
 *
 * @author Richard
 */
public class PreLab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Declare PI as a constant
        final double PI = 3.14159;

        // Declare radius and height as variables
        int radius;
        int height;

        // Prompt the user to enter a  value for radius1 and height1
        System.out.print("Enter a the radius and height of the first cone: ");
        double radius1 = input.nextDouble();
        double height1 = input.nextDouble();

        // Prompt the user to enter a  value for radius2 and height2
        System.out.print("Enter a the radius and height of the second cone: ");
        double radius2 = input.nextDouble();
        double height2 = input.nextDouble();

        //Compute volume of the first cone using V = π * r2 * h/3
        double volume1 = (PI * (radius1 * radius1) * (height1 / 3));

        // Compute volume of a the second cone using V = π * r2 * h/3
        double volume2 = (PI * (radius2 * radius2) * (height2 / 3));

        // Display result for volume of first cone
        System.out.println("The volume for the first cone " + " is " + volume1);

        // Display result for volume of second cone
        System.out.println("The volume for the second cone "
                + " is " + volume2);

        // Display results for the difference on volume between two cones
        System.out.println("The difference in volumes is " + (Math.abs(volume1 - volume2)));

    }

}
