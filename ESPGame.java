/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: The assignment was to create an ESP Game that would make the user try to guess
 * the color that the computer is thinking about.
 * Due: 02/26/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		
		String choice, name, MCNumber, description, dueDate, color = "";
		int correctGuesses = 0;
		final String COLOR_RED = "Red";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_INDIGO = "Indigo";
		final String COLOR_PURPLE = "Purple";
		
		/**
		 * scanner to be able to recieve user input
		 * rand to create random number generator
		 */
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		/**
		 * Asks user for input on certain questions and stores it in variables to call
		 * them later
		 */
		System.out.print("Enter your name: ");
		name = scanner.nextLine(); 
		
		System.out.print("What is your MC M#? ");
		MCNumber = scanner.nextLine();
		
		System.out.print("Describe yourself: ");
		description = scanner.nextLine();
		
		System.out.print("Due date: ");
		dueDate = scanner.nextLine();
		
		System.out.println("CMSC 203 Assignment1: Test your ESP skills!\n");
		
		/**
		 * Loop that prints out the game the correct amount of times. In this case 11.
		 */
		
		for (int i = 1; i <= 11; i++) {
			
			/**
			 * Prints out the round number and prompts the user to enter one of the
			 * seven correct choices
			 */
			System.out.println("Round " + i);
			int randomNumber = rand.nextInt(7) + 1;
			
			System.out.print("I am thinking of a color.\n Is it Red, Orange, Yellow, Green, Blue, Indigo or Purple? \n Enter your guess: ");
			choice = scanner.nextLine();
			
			/**
			 * Validation to see if what the user input is part of the seven possible correct
			 * choices
			 */
			while (!(choice.equalsIgnoreCase(COLOR_RED) || choice.equalsIgnoreCase(COLOR_ORANGE) || 
			          choice.equalsIgnoreCase(COLOR_YELLOW) || choice.equalsIgnoreCase(COLOR_GREEN) || 
			          choice.equalsIgnoreCase(COLOR_BLUE) || choice.equalsIgnoreCase(COLOR_INDIGO) || 
			          choice.equalsIgnoreCase(COLOR_PURPLE))) {
			    
			    System.out.println("You entered an incorrect color. Please enter a valid color.\n");
			    System.out.print("Enter your guess: "); 
			    choice = scanner.nextLine();
			}

			/**
			 * Switch case that assigns the random number from the random number generator
			 * to the correct constant color name.
			 */
			switch (randomNumber) {
			case 1:
				color = COLOR_RED;
				break;
			case 2:
				color = COLOR_ORANGE;
				break;
			case 3:
					color = COLOR_YELLOW;
				break;
			case 4:
				color = COLOR_GREEN;
				break;
			case 5:
				color = COLOR_BLUE;
				break;
			case 6:
				color = COLOR_INDIGO;
				break;
			case 7:
				color = COLOR_PURPLE;
				break;
			}
			/**
			 * Tells the user what color it was thinking of, if the color the user input is the
			 * same as the color the computer was thinking of, then we add 1 to the number of
			 * correct guesses that the user has made.
			 */
			System.out.println("I was thinking of " + color + "\n");
			if (choice.equalsIgnoreCase(color)) {
				correctGuesses++;
			}
		}
		/**
		 * Print the information that the user input at the beginning of the program
		 */
		System.out.println("\n\nGame Over");
		System.out.println("\nYou guessed " + correctGuesses + " out of 11 colors correctly!");
		System.out.println("\nStudent name: " + name);
		System.out.println("User description: " + description);
		System.out.println(dueDate);
	}
}
