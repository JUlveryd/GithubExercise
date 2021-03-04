package handledning3;

import java.util.Scanner;

public class Yatzy2 {

	static int numOfDice = 5;
//	static int rounds = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		for (int j = rounds; j < 1; j++) {
		Dice2 choise = new Dice2();

		int[] diceArray = new int[numOfDice];

		for (int i = 0; i < numOfDice; i++) {
			diceArray[i] = choise.rollDice();
		}

		for (int i = 0; i < numOfDice; i++) {
			System.out.println("Die " + (i + 1) + " has value " + diceArray[i]);
		}

		System.out.println("How many dice to reroll?: ");
		int reroll = scan.nextInt();

		for (int i = 0; i < reroll; i++) {
			System.out.println("Which die to reroll? ");
			int diceNumber = scan.nextInt();

			diceArray = Dice2.whichDice(diceArray, diceNumber);
		}

		for (int i = 0; i < numOfDice; i++) {
			System.out.println("Dice " + (i + 1) + " has value " + diceArray[i]);
		}

//		int chance = diceArray[0] + diceArray[1] + diceArray[2] + diceArray[3] + diceArray[4];
//		System.out.print("Chance is " + chance);
	}
//	}
}
