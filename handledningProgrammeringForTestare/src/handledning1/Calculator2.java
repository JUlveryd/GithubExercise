package handledning1;

import java.util.Scanner;

public class Calculator2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange första talet: ");
		double a = scan.nextDouble();
		
		System.out.print("Ange andra talet: ");
		double b = scan.nextDouble();
		
		scan.close();
		
		double add = a + b;
		System.out.println(add);
		
		double sub = a - b;
		System.out.println(sub);
		
		double multi = a * b;
		System.out.println(multi);
		
		double div = a / b;
		System.out.println(div);
		
		
	}

}
