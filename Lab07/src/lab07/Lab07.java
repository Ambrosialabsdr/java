/** ****************************************************************************
 * Program Name:          Lab07
 * Program Description: The program grades and the scores, the lowest, highest, average, number A’s, B’s C’s, D’s, F’s.
 * Program Author:        Richard Ruiz
 * Date Created:          4/20/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ***************************************************************************** */
package lab07;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
//Decalre arrayLenght as variable
        int arrayLength = input.nextInt();
//Create and define Array
        int array[] = new int[arrayLength];
// Prompt user to enter scores
        System.out.print("Enter 5 scores: ");
// 0 to array length
        for (int i = 0; i < arrayLength; i++) {
// Input array [i]
            array[i] = input.nextInt();

        }

        System.out.print("Printed scores:");
// declare printScores(array)
        printScores(array);
//Output the rest of the arrays and their results
        System.out.println("\nLow: " + lowestScore(array));

        System.out.println("High: " + highestScore(array));

        System.out.println("Avg: " + averageScore(array));

        System.out.println("A's: " + countGrades(array, 'A'));

        System.out.println("B's: " + countGrades(array, 'B'));

        System.out.println("C's: " + countGrades(array, 'C'));

        System.out.println("D's: " + countGrades(array, 'D'));

        System.out.println("F's: " + countGrades(array, 'F'));

        printDescendingScores(array);

    }

    // print scores method
    public static void printScores(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(" " + array[i]);

        }

    }

    // lowest score
    public static int lowestScore(int[] array) {

        int lowest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < lowest) {
                lowest = array[i];
            }

        }

        return lowest;

    }

    // highest score
    public static int highestScore(int[] array) {

        int highest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (highest < array[i]) {
                highest = array[i];
            }

        }

        return highest;

    }

    // average score
    public static double averageScore(int[] array) {

        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];

        }

        sum = sum / array.length;

        return sum;

    }

    // count grades
    public static int countGrades(int[] array, char gradeType) {

        int count = 0;

        char grades[] = new char[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= 90 && array[i] <= 100) {
                grades[i] = 'A';
            } else if (array[i] >= 80 && array[i] <= 89) {
                grades[i] = 'B';
            } else if (array[i] >= 70) {
                grades[i] = 'C';
            } else if (array[i] >= 60) {
                grades[i] = 'D';
            } //65 78 75 98 87
            else {
                grades[i] = 'F';
            }

        }

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] == gradeType) {
                count++;
            }

        }

        return count;

    }

    // print descending scores
    public static void printDescendingScores(int[] array) {

        java.util.Arrays.sort(array);

        System.out.print("Scores in descending order: ");

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(" " + array[i]);

        }

        System.out.println();

    }

}
