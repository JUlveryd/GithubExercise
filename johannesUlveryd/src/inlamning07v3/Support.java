package inlamning07v3;

import java.util.Scanner;

public class Support {

	private Scanner scan = new Scanner(System.in);

	private String[] engAlph = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",",
			"?" };
	private String[] morAlph = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
			"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", ".-.-.-", "--..--",
			"..--.." };

	public void menu(int menuIn) {

		switch (menuIn) {
		case 1:
			System.out.println("Please input letter to translate");
			String inE = scan.nextLine();
			reMorse(inE);
			break;
		case 2:
			System.out.println("Please input code to translate");
			String inM = scan.nextLine();
			noRemorse(inM);
			break;
		case 3:
			System.out.println("Thank you for using the translator. Bye!");
			break;
		default:
			System.out.println("Invalid input.\n");
		}
	}

	public String reMorse(String input) {
		String output = "";
		try {
			for (int i = 0; i < engAlph.length; i++) {
				if (engAlph[i].equals(input.toUpperCase())) {
					output = morAlph[i];
					System.out.println(input + " translates to " + output);
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		return output;
	}

	public String noRemorse(String input) {
		String output = "";
		try {
			for (int i = 0; i < morAlph.length; i++) {
				if (morAlph[i].equals(input.toUpperCase())) {
					output = engAlph[i];
					System.out.println(input + " translates to " + output);
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		return output;
	}
}