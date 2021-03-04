package inlamning07;

import java.util.Scanner;

public class Translator {

	public static void main(String[] args) {
		
		Converter con = new Converter();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the English Morse translator!");
		System.out.println("Please choose an option:\n 1. Translate from English to Morse\n 2. Translate from Morse to English\n 3. Exit");

		int menuInput = Integer.valueOf(scan.nextLine());
		con.menu(menuInput);
		
		if (menuInput == 1) {
			System.out.println("Please enter the text to be translated to Morse code.");
			String engInput = scan.nextLine();
			con.engToMorse(engInput);
		}
		
		
		
		
		scan.close();
	}

}
