package handledning2exempel;

import java.util.Scanner;

public class Input {
	public static int menu(){
		int oper =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in number for operation: ");
		System.out.println("1 for Addition ");
		System.out.println("2 for Substracion ");
		System.out.println("3 for Multiplication ");
		System.out.println("4 for Division ");
		System.out.println("5 for Exit program ");
		
		oper = scan.nextInt();
		scan.close();
		
		return oper;
	}	public static int menu2(){
		int oper =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Pelles meny");
		System.out.println("1 for Addition ");
		System.out.println("2 for Substracion ");
		System.out.println("3 for Multiplication ");
		System.out.println("4 for Division ");
		System.out.println("5 for Exit program ");
		
		oper = scan.nextInt();
		scan.close();
		
		return oper;
	}

}
