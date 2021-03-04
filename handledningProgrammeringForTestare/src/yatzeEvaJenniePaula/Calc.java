package yatzeEvaJenniePaula;

public class Calc {

	public int sumAll(int[] diceNumbers) {
		int sum = 0;
		for (int i = 0; i < diceNumbers.length; i++) {
			sum = sum + diceNumbers[i];
		}
		return sum;
	}

	public int sumOnes(int[] diceNumbers, int n) {
		int sum = 0;
		for (int i = 0; i < diceNumbers.length; i++) {
			if (diceNumbers[i] == n) {
				sum = sum + diceNumbers[i];
			}
		}
		return sum;
	}
}