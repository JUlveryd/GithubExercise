package inlamning07v1;

import java.util.Scanner;

public class Converter1 {

	private String[] engAlph = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",",
			"?" };
	private String[] morseAlph = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
			"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", ".-.-.-", "--..--",
			"..--.." };
	private String morseLetter;

	public int menu(String menuIn) {
		int menuOp = 0;
		
		if (menuIn.equals("3")) {
			System.out.println("Thank you for using the translator.");
		}
		else if (menuIn.equals("1")) {
			menuOp = 1;
		}
		else if (menuIn.equals("2")) {
			menuOp = 2;
		}
		else {
			System.out.println("Please input a valid option.");
		}	
		return menuOp;
	}

	public String engToMorse(String string) {
//		int engLength = engAlph.length;
//		int morseLength = morseAlph.length;
//		System.out.println("engAlph length is " + engLength);
//		System.out.println("morseAlph length is " + morseLength);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter English letter to translate to Morse Code: ");
		String input = scan.nextLine();

		if (input.equals("a")) {
			morseLetter = String.valueOf(morseAlph[0]);

		} else {
			morseLetter = String.valueOf(morseAlph[1]);

		}
		return morseLetter;
	}

	public String morseToEng(String input) {
//		Scanner scanTwo = new Scanner(System.in);
//
//		System.out.println("Enter English letter to translate to Morse Code: ");
//		String input = scanTwo.nextLine();
//
		return input;
	}

}
