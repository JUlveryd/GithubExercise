package inlamning07v2;

public class Printer {

	public void print(int printOp) {

		switch (printOp) {
		case 1:
			System.out.println("Welcome to the English Morse translator.");
			break;
		case 2:
			System.out.println("Please choose an option: \n 1. Translate from English to Morse \n 2. Translate from Morse to English \n 3. Exit");
			break;
		case 3:
			System.out.println("Please input letter to translate");
			break;
		case 4:
			System.out.println("Invalid character.");
			break;
		case 5:
			System.out.println("Thank you for using the translator. Bye!");
			break;
		default:
			System.out.println("Please choose a valid option.\n");			
		}
	}
}
