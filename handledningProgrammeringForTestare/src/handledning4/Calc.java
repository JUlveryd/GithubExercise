package handledning4;

public class Calc {

	public int sum(int[] diceRolls) {
		int sum = 0;
		for (int i = 0; i < diceRolls.length; i++) {
			sum = sum + diceRolls[i];
		}
		return sum;
	}
}
