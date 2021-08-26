/** ****************************************************************************
 * Program Name:          PreLab05A - Challenge
 * Program Description: Enter an integer between 1-9 and print out a pattern
 *
 * Program Author:        Richard Ruiz
 * Date Created:          3/24/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ***************************************************************************** */
package prelab05a;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class PreLab05A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare variable input maxCount
        int maxCount;
        int totalIntegersWritten = 0;
        int totalSum = 0;
        System.out.println(" Enter an integer between 1 and 9, inclusive: ");
        maxCount = input.nextInt();
        // Create the while loop - continuation-condition
        while ((maxCount < 1 || maxCount > 9)) {
            System.out.println("Please enter a valid number");
            maxCount = input.nextInt();
        }
        System.out.println("");

        // Create nested loop
        for (int rowCtr = 1; rowCtr < maxCount; rowCtr++) {
            for (int colCtr = 1; colCtr < rowCtr; colCtr++) {
                System.out.print(rowCtr);
                totalIntegersWritten = totalIntegersWritten + 1;
                totalSum = totalSum + rowCtr;
                System.out.println(rowCtr);

            }
        }
        System.out.println(" The total number of integers written: " + totalIntegersWritten);
        System.out.println(" The totla sum of all integers: " + totalSum);

    }

}
