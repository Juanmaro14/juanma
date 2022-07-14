package javaAssignments1;

import java.util.Scanner;

public class JavaAssignment1 {

	public static void main(String[] args) {
		// Write a program to calculate the factorial of a number using a while loop.
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i = 1;

		System.out.println("Enter a number whose factorial is to be found: ");
		int num = sc.nextInt();

		while (i <= num) {
			fact = fact * i;
			i++;
		}

		System.out.println("\nFactorial of " + num + " is: " + fact);
	}
}