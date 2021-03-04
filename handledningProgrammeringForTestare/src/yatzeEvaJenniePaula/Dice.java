package yatzeEvaJenniePaula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dice {

	int[] diceNumbers = new int[5];

	// Random dice numbers
	public int roll() {
		int result = (int) (Math.random() * 6) + 1;
		return result;
	}

	// Print dice numbers
	public void printNumbers() {
		for (int j = 0; j < 5; j++) {
			System.out.println("The " + (j + 1) + " dice is: " + diceNumbers[j]);
		}
	}

	// Reads and saves the numbers in the array
	public void allFive() {
		for (int i = 0; i < 5; i++) {
			diceNumbers[i] = roll();
		}
	}

	// Reroll alternatives, Y/N
	public void reroll() {
		int turn = 1;
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Do you want to reroll a dice? Y/N ");
			String rerollChoice = scan.nextLine();
			
			if (rerollChoice.equals("Y") || rerollChoice.equals("y")) {
				rerollDices();
				turn++;
			} 		
			else if (rerollChoice.equals("N") || rerollChoice.equals("n")) {
				System.out.println("No."); // Maybe delete this later.
				turn = 4;
			} else {
				System.out.println("Invalid input, choose Y/N.");
				reroll();
				
			}
			scan.close();
		} while (turn < 3);

	}
	
	// Rerolling dices
	public void rerollDices() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" --- Reroll --- ");
		System.out.println("How many dices do you want to reroll?");
		int rerollNumber = scan.nextInt();

		for (int i = 0; i < rerollNumber; i++) {
			System.out.println("Which dice do you want to reroll? (One at a time) :");
			try { // FIX THIS
				int rerollDiceNumber = scan.nextInt();
				diceNumbers[rerollDiceNumber - 1] = roll();
				System.out.println("New dice number is " + diceNumbers[rerollDiceNumber - 1]);
			} catch (InputMismatchException e) { // FIX THIS
				System.out.println("Wrong input, please choose between 1-5.");
				reroll();
			}

		}
		System.out.println("Your dice numbers are now:");
		printNumbers();
		scan.close();
	}
}
