package inlamning07v2;

import java.util.Scanner;

public class Translator2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Converter2 con = new Converter2();
		Printer printer = new Printer();
		int menuIn;
		printer.print(1);

		do {			
			printer.print(2);
			menuIn = scan.nextInt();
			switch (menuIn) {
			case 1:
				con.engToMorse();
				break;
			case 2:
				con.morseToEng();
				break;
			case 3:
				printer.print(6);
				scan.close();
				break;
			default:
				printer.print(0);
			}

		} while (!(menuIn == 3));
	}

}
