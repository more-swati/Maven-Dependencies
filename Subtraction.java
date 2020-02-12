package Printing;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {

		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first nummber:");
		a = sc.nextInt();
		
		System.out.println("Enter the second nummber:");
		b = sc.nextInt();
		
		sc.close();
		
		c = a-b;
		
		System.out.println("The subtraction is: " +c);

	}

}
