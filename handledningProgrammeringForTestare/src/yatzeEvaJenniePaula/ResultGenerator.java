package yatzeEvaJenniePaula;

public class ResultGenerator {

	int result;
	Calc calc = new Calc();
	
	public int getResult(int[] diceNumbers, int i) {
		result = calc.sumAll(diceNumbers);
		return result;
	}
	
	public void viewResult() {
		System.out.println("The sum of your dices is: " + result);
	}
	
//	public int PointsSaver(int[] diceNumbers) {
//		result = calc.sumOnes(int[] diceNumbers, 5);
//		return result;
		
//		int sum = 0;
//		for (int i = 0; i < diceNumbers.length; i++) {
//			if (diceNumbers[i] == 1) {
//				sum = sum + diceNumbers[i];
//			}	
//	}
//		return sum;
//	}
}
