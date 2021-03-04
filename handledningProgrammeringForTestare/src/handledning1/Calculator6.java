package handledning1;

import java.util.Scanner;

public class Calculator6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int menu = 0;
		double previous = 0;
		double a = 0;
		double b = 0;
		double add;
		double sub;
		double mul;
		double div;

		while (menu != 5) {
			System.out.println("Choose operation: ");
			System.out.println("1: Add");
			System.out.println("2: Subtract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("5: Exit");
			int method = scan.nextInt();

			if (method == 1) {
				System.out.println("1: Use previous answer: ");
				System.out.print("2: Type new number: ");
				int method1 = scan.nextInt();

				if (method1 == 1) {
					a = previous;
				}

				if (method1 == 2) {
					a = scan.nextDouble();
				}

				System.out.print("Type second number: ");
				b = scan.nextDouble();

				add = a + b;
				System.out.println(add);
				System.out.println("");
				previous = add;

			}

			if (method == 2) {
				System.out.println("1: Use previous answer: ");
				System.out.print("2: Type new number: ");
				int method1 = scan.nextInt();

				if (method1 == 1) {
					a = previous;
				}

				if (method1 == 2) {
					a = scan.nextDouble();
				}

				System.out.print("Type new number: ");
				b = scan.nextDouble();

				sub = a + b;
				System.out.println(sub);
				System.out.println("");
				previous = sub;

			}

			if (method == 3) {
				System.out.println("1: Use previous answer: ");
				System.out.print("2: Type new number: ");
				int method1 = scan.nextInt();

				if (method1 == 1) {
					a = previous;
				}

				if (method1 == 2) {
					a = scan.nextDouble();
				}

				System.out.print("Type new number: ");
				b = scan.nextDouble();

				mul = a + b;
				System.out.println(mul);
				System.out.println("");
				previous = mul;

			}

			if (method == 4) {
				System.out.println("1: Use previous answer: ");
				System.out.print("2: Type new number: ");
				int method1 = scan.nextInt();

				if (method1 == 1) {
					a = previous;
				}

				if (method1 == 2) {
					a = scan.nextDouble();
				}

				System.out.print("Type new number: ");
				b = scan.nextDouble();

				div = a + b;
				System.out.println(div);
				System.out.println("");
				previous = div;

			}

			if (method > 5) {
				System.out.println("No valid option.");
				System.out.println("");

			}

			if (method == 5) {
				System.out.print("Bye!");
				menu = 5;

			}

		}
		scan.close();
	}

}
