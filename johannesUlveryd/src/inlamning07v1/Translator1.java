package inlamning07v1;

import java.util.Scanner;

public class Translator1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Converter1 con = new Converter1();		
		
		System.out.println("Welcome to the English Morse translator.");
		System.out.println(
		"Please choose an option:\n 1. Translate from English to Morse\n 2. Translate from Morse to English\n 3. Exit");
		String menuIn = scan.nextLine();
		con.menu(menuIn);			
		
		
//		System.out.println(output);
	}

}
