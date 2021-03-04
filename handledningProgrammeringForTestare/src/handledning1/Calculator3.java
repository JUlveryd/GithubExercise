package handledning1;

import java.util.Scanner;

public class Calculator3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange första talet: ");
		double a = scan.nextDouble();
		
		System.out.print("Ange räknesätt. 1 = +, 2 = -, 3 = *, 4 = / ");
		int method = scan.nextInt();
		
		System.out.print("Ange andra talet: ");
		double b = scan.nextDouble();
		
		
		if (method == 1) {
			double add = a + b;
			System.out.println(add);
		}
			
		if (method == 2) {
			double sub = a - b;
			System.out.println(sub);
		}
			
		if (method == 3) {
			double multi = a * b;
			System.out.println(multi);
		}
			
		if (method == 4) {
			double div = a / b;
			System.out.println(div);
		}	
		
		scan.close();
	}

}
