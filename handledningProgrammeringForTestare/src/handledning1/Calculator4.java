package handledning1;

import java.util.Scanner;

public class Calculator4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 1;
		
		while (menu == 1) {
		System.out.println("Vad vill du göra?: ");
		System.out.println("1: Addera");
		System.out.println("2: Subtrahera");
		System.out.println("3: Multiplicera");
		System.out.println("4: Dividera");
		System.out.println("5: Avsluta");
		int method = scan.nextInt();
		
				
		if (method == 1) {
			System.out.print("Ange första talet: ");
			double a = scan.nextDouble();
			
			System.out.print("Ange andra talet: ");
			double b = scan.nextDouble();
			
			double add = a + b;
			System.out.println(add);
			System.out.println("");
			menu = 1;

		}
			
		if (method == 2) {
			System.out.print("Ange första talet: ");
			double a = scan.nextDouble();
			
			System.out.print("Ange andra talet: ");
			double b = scan.nextDouble();
			
			double sub = a - b;
			System.out.println(sub);
			System.out.println("");
			menu = 1;
			
		}
			
		if (method == 3) {
			System.out.print("Ange första talet: ");
			double a = scan.nextDouble();
			
			System.out.print("Ange andra talet: ");
			double b = scan.nextDouble();
			
			double multi = a * b;
			System.out.println(multi);
			System.out.println("");
			menu = 1;
			
		}
			
		if (method == 4) {
			System.out.print("Ange första talet: ");
			double a = scan.nextDouble();
			
			System.out.print("Ange andra talet: ");
			double b = scan.nextDouble();
			
			double div = a / b;
			System.out.println(div);
			System.out.println("");
			menu = 1;
			
		}
		
		if (method == 5) {
			System.out.print("Hejdå!");
			menu = 2;
		}
		
		}
		scan.close();
	}
	
}
