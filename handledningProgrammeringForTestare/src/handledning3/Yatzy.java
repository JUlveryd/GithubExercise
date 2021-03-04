package handledning3;

import java.util.Scanner;

public class Yatzy {

	static int diceNumber = 5;
	static int rounds = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int j = rounds; j < 1; j++) {
			Dice choise = new Dice();

			int[] diceArray = new int[diceNumber];

			for (int i = 0; i < diceNumber; i++) {
				diceArray[i] = choise.rollDice();
			}

			for (int i = 0; i < diceNumber; i++) {
				System.out.println("Die " + (i + 1) + " has value " + diceArray[i]);
			}

			System.out.println("How many dice to reroll?: ");
			int reroll = scan.nextInt();

			for (int i = 0; i < reroll; i++) {
				System.out.println("Which die to reroll? ");
				int diceNumber2 = scan.nextInt();
				
				//if (diceNumber2 == 0) {
					//break; ???
				//}

				if (diceNumber2 == 1) {
					diceArray[0] = choise.rollDice();
				}

				if (diceNumber2 == 2) {
					diceArray[1] = choise.rollDice();
				}

				if (diceNumber2 == 3) {
					diceArray[2] = choise.rollDice();
				}

				if (diceNumber2 == 4) {
					diceArray[3] = choise.rollDice();
				}

				if (diceNumber2 == 5) {
					diceArray[4] = choise.rollDice();
				}

			}

			for (int i = 0; i < diceNumber; i++) {
				System.out.println("Dice " + (i + 1) + " has value " + diceArray[i]);
			}

			System.out.println("How many dice to reroll?: ");
			int reroll2 = scan.nextInt();

			for (int i = 0; i < reroll2; i++) {
				System.out.println("Which die to reroll? ");
				int diceNumber2 = scan.nextInt();

				if (diceNumber2 == 1) {
					diceArray[0] = choise.rollDice();
				}

				if (diceNumber2 == 2) {
					diceArray[1] = choise.rollDice();
				}

				if (diceNumber2 == 3) {
					diceArray[2] = choise.rollDice();
				}

				if (diceNumber2 == 4) {
					diceArray[3] = choise.rollDice();
				}

				if (diceNumber2 == 5) {
					diceArray[4] = choise.rollDice();
				}

			}
			for (int i = 0; i < diceNumber; i++) {
				System.out.println("Dice " + (i + 1) + " has value " + diceArray[i]);
				
			
				
			}
			int chance = diceArray[0] + diceArray[1] + diceArray[2] + diceArray[3] + diceArray[4];
			System.out.print("Chance is " +  chance );
		}
	}
}
