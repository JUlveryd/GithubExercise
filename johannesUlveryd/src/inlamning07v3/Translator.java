package inlamning07v3;

import java.util.Scanner;

public class Translator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Support s = new Support();
		
		int menuIn;
		System.out.println("Welcome to the English Morse translator.");

		do {			
		System.out.println("Please choose an option: \n 1. Translate from English to Morse \n 2. Translate from Morse to English \n 3. Exit");
		menuIn = scan.nextInt();
		s.menu(menuIn);

		} while (!(menuIn == 3));
	}
}