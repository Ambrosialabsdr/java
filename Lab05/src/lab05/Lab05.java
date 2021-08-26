/** ****************************************************************************
 * Program Name:          Lab05
 * Program Description: This simulates a lottery game that generates a random integer between 1 and 10
 *
 * Program Author:        Richard Ruiz
 * Date Created:          3/09/2021
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ***************************************************************************** */
package lab05;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);

        final double TICKET_PRICE = 2.00;

        System.out.println(" Welcome to the State of Connecticut Play10 Lottery Game. Ticket Price $ " + TICKET_PRICE);
        System.out.println(" How many tickets would you like to purchase?");
        int ticketsPurchased = input.nextInt();
        System.out.println("Please enter " + (TICKET_PRICE * ticketsPurchased) + " to confirm your credit card charge:");
        double creditCardCharge = input.nextDouble();

        while (creditCardCharge != (TICKET_PRICE * ticketsPurchased)) {
            System.out.println("Incorrect amount. Please re-enter:");
            creditCardCharge = input.nextDouble();
        }
        System.out.println("Thank you. Your credit card will be charged $" + creditCardCharge);
        int winner = 1 + (int) (Math.random() * ((10 - 1) + 1));
        System.out.println("Would you like the computer to generate your guesses? Enter 'Y' or 'N':");
        char computerGeneratedGuess0 = input.next().charAt(0);
        char computerGeneratedGuess = Character.toLowerCase(computerGeneratedGuess0);
        int guess = 0;
        int winCtr = 0;
        String output = "";

        if (computerGeneratedGuess == 'y') {
            for (int i = 1; i <= ticketsPurchased; i++) {
                guess = 1 + (int) (Math.random() * ((10 - 1) + 1));
                System.out.println("Ticket " + i + "'s guess is " + guess);
                if (guess == winner) {
                    winCtr = winCtr + 1;
                    output = output + "Ticket " + i + " is a winner\n";
                }
            }
            System.out.println("");
        } else if (computerGeneratedGuess == 'n') {
            for (int i = 1; i <= ticketsPurchased; i++) {
                System.out.println("Please enter guess: " + i);
                guess = input.nextInt();
                while (guess < 1 || guess > 10) {
                    System.out.println("Invalid guess. Please re-enter a guess between 1-10 ");
                    guess = input.nextInt();

                }
                if (guess == winner) {
                    winCtr = winCtr + 1;
                    output = output + "Ticket " + i + " is a winner\n";
                }
            }
            System.out.println("");
        } else {
            System.out.println("Invalid input, program ending.\nYour credit card will be reimbursed $ " + creditCardCharge);
            System.exit(0);
        }
        System.out.println("The winning number is " + winner);
        System.out.println(output);
        double winnings = winCtr * TICKET_PRICE * 10;
        double losings = (ticketsPurchased - winCtr) * TICKET_PRICE;
        System.out.println("Your total winnings is $" + winnings);
        System.out.println("After your credit card deduction, your balance is $" + (winnings - creditCardCharge));
        System.out.println("You can deduct the cost of your losses ($" + losings + ") up to the amount of your winnings ($" + winnings + ") from your taxes");
        double allowableDeduction;

        if (winnings <= losings) {
            allowableDeduction = winnings;
        } else {
            allowableDeduction = losings;
        }
        System.out.println("Allowable deduction: $" + allowableDeduction);

    }
}
