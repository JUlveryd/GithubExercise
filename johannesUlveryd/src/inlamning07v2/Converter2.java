package inlamning07v2;

import java.util.Scanner;

public class Converter2 {
	
	private Scanner scan = new Scanner(System.in);
	private Printer printer = new Printer();

	private String[] engAlph = { "a", "e" };
	private String[] morAlph = { ".-", "." };

	public void engToMorse() {

		printer.print(3);
		String output = null;
		String input = scan.nextLine();
		String [] inputAry = input.split("");
		
//		for(int i = 0; i <inputAry.length; i++) {
//		System.out.print(inputAry[i] + " ");
		
		for(int i = 0; i <inputAry.length; i++) {
			System.out.print(inputAry[i] + " ");
		}
//		if (input.equals("a")) {
//			output = ".-";
//			// System.out.println("A is " + output);
//		} else if (input.equals("e")) {
//			output = ".";
//			// System.out.println("E is " + output);
//		} else {
//			printer.print(4);
//		}
		//System.out.println(input + " is " + output + "\n");
		System.out.println("");
	}

	public void morseToEng() {
		String result = ".-";
//		if(mte == ".-") {
//			result = "a";
//			System.out.println(".- means " + result);
//		}
	}
}
