package handledning4;

public class ResultGenerator {

	public int getResult(int[] diceRolls, int i) {
		Calc a = new Calc();
		int result = a.sum(diceRolls);
		return result;
		// return 19;
	}
}
