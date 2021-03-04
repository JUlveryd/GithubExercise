package handledning3;

public class Dice2 {

	public int rollDice() {

		int intDice = (int) (Math.random() * 6) +1;
		return intDice;

	}
	
	public static int[] whichDice(int[] diceArray2, int diceNum) {
		Dice2 choise = new Dice2();
		
		if (diceNum == 1) {
			diceArray2[0] = choise.rollDice();
		}

		if (diceNum == 2) {
			diceArray2[1] = choise.rollDice();
		}

		if (diceNum == 3) {
			diceArray2[2] = choise.rollDice();
		}

		if (diceNum == 4) {
			diceArray2[3] = choise.rollDice();
		}

		if (diceNum == 5) {
			diceArray2[4] = choise.rollDice();
		}
		
		return diceArray2;
	}

}
