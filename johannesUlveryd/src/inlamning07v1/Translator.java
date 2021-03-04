package inlamning07v1;

import java.util.Scanner;

public class Translator {

	public static void main(String[] args) {

		String output = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the English Morse translator!");
		System.out.println("Please choose an option:\n 1. Translate from English to Morse\n 2. Translate from Morse to English\n 3. Exit");

		int input = Integer.valueOf(scan.nextLine());
		Converter con = new Converter();
		if (input == 1) {

			output = con.engToMorse();
		}
		System.out.println(output);
	}

}
