package Secretgame;

import java.util.Scanner;
/**
 *
 * @author Vic Boo
 */
public class Secretgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare variables
        int secretNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
        int guess;
        // Introduction
        System.out.println("Try to guess the secret number between 1 and 100! If you give up, enter -1.");
        // Start the Do
        do { 
            System.out.print("Enter your number: ");
            guess = scanner.nextInt();
            // Create surrender command
            if (guess == -1) {
                System.out.println("You gave up. The secret number was: " + secretNumber);
                break;
            }
            // Create search command
            if (guess > secretNumber) {
                System.out.println("The secret number is smaller.");
            } else if (guess < secretNumber) {
                System.out.println("The secret number is greater.");
            } else {
                System.out.println("You guessed the secret number!");
            }
        }  
        // Declare the while
        while (guess != secretNumber);
        // Farewell message
        System.out.println("Thanks for playing.");
    } 
}
