package inlamning07;

public class Converter {

	public int menu(int input) {

		int result = 0;

		if (input == 3) {
			System.out.println("Bye!");
		}

		if (input == 1 || input == 2) {
			result = input;
		}

		else {
			System.out.println("Not a valid menu choice. Please choose again.");
		}
		return result;
	}

	public String engToMorse(String letter) {

		String result = "f";
		if (letter == "E") {
			result = ".";
			System.out.println(result);
		}
		return result;
	}

	public String morseToEng(String letter) {

		String result = "";
		if (letter == "..") {
			result = "I";

		}
		return result;
	}

}
