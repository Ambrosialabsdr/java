/** ****************************************************************************
 * Program Name:          Lab06
 * Program Description: This program calls a method to calculate a tiered commission rate
 *
 * Program Author:        Richard Ruiz
 * Date Created:          4/07/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ***************************************************************************** */
package lab06;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Richard
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$###,###,##0.00");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter table start:");
        double tableStart = input.nextDouble();

        System.out.print("Enter table end:");
        double tableEnd = input.nextDouble();

//        double max = (Math.max(tableEnd, tableStart));
//        double min = (Math.min(tableStart, tableEnd));
        System.out.print("Enter increment:");
        double increment = input.nextInt();

        /* Initialize Number Value */
        double salesAmount = 0;
        /* Initialize Increment Value */
        double Commission = 0;
        /* Print First Number */
        System.out.println(salesAmount);
        for (double i = 0; i < 10; i++) {
            /* Increment Number */
            salesAmount += increment;
            /* Print Next Number In List */
            System.out.println(salesAmount);
            /* Increment The Increment Counter */
            ++increment;

            double computeCommission = 0;
//             double salesAmount = tableStart;

            System.out.println("Sales Amount: " + salesAmount + "        " + " Commission " + computeCommission);

        }
    }

    public static double computeCommission(double salesAmount) {
        DecimalFormat df = new DecimalFormat("$###,###,##0.00");
        double result = 0;
        while (salesAmount != 0) {
            if (salesAmount >= 20000) {
                double Commission = (10000 * 0.075) + (10000 * 0.1125) + ((salesAmount - 20000) * 0.145);
            } else if (salesAmount >= 10000.01) {
                double Commission = (10000 * 0.075) + (10000 * 0.1125);
            } else {
                double Commission = salesAmount * 0.075;

                System.out.println(salesAmount + Commission);
            }
        }
        return result;

    }
}
