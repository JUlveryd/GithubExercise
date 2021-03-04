package handledning2;

import java.util.Scanner;

public class Calculator7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int c = 0;

		while (c != 5) {
			System.out.println("Choose operation: ");
			System.out.println("1: Add");
			System.out.println("2: Subtract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("5: Exit");
			c = scan.nextInt();

			if (c == 5) {
				System.out.print("Bye!");
			}

			else if (c == 1 || c == 2 || c == 3 || c == 4) {
				System.out.print("Type first number: ");
				double a = scan.nextDouble();

				System.out.print("Type second number: ");
				double b = scan.nextDouble();

				Operations op = new Operations();

				double r = op.calcOp(a, b, c);

				System.out.println();
				System.out.println("The result is " + r);
				System.out.println();

			}

			else {
				System.out.println("Invalid choice, try again.");
				System.out.println();
			}

		}
		scan.close();
	}

}
