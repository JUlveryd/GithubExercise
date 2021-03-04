package yatzeEvaJenniePaula;

import java.util.Scanner;

public class Yatzy {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dice dice = new Dice();
				
		dice.allFive();
		dice.printNumbers();
				
		dice.reroll();
		
//		ResultGenerator result = new ResultGenerator();
//		int b = result.getResult(dice.diceNumbers, 13);
//		result.viewResult();
//
//		Calc calc = new Calc();
//		System.out.println("Your ones: " + calc.sumOnes(dice.diceNumbers));
		scan.close();
	}
}
