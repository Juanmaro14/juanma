package javaAssignments2;

import java.util.Scanner;

public class JavaAssignment4 {

	public static void main(String[] args) {
		// Find the sum of digits
		Scanner sc = new Scanner(System.in);
		int digit, sum = 0;

		System.out.print("Enter the number: ");
		int number = sc.nextInt();

		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println("Sum of Digits: " + sum);
	}

}
