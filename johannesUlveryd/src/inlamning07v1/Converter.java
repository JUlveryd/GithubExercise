package inlamning07v1;

import java.util.Scanner;

public class Converter {

	public String[] engAlph = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};
	public String[] morseAlph = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", ".-.-.-", "--..--", "..--.."};
	public String morseLetter;
	
	
	
	
	public String engToMorse() {
//		int engLength = engAlph.length;
//		int morseLength = morseAlph.length;
//		System.out.println("engAlph length is " + engLength);
//		System.out.println("morseAlph length is " + morseLength);
		
		Scanner scanTwo = new Scanner(System.in);
		System.out.println("Enter English letter to translate to Morse Code: ");
		String input = scanTwo.nextLine();

		if (input.equals("a")) {
			morseLetter = String.valueOf(morseAlph[0]);

		}
		else {
			morseLetter = String.valueOf(morseAlph[1]);
			
		}
		return morseLetter;
	}

	
	
//	public static String morseToEnglish(int inputNo) {
//		Scanner scanTwo = new Scanner(System.in);
//
//		System.out.println("Enter English letter to translate to Morse Code: ");
//		String input = scanTwo.nextLine();
//
//		return input;
//	}

}
