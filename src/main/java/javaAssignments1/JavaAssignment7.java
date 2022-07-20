package javaAssignments1;

public class JavaAssignment7 {
	public static void main(String[] args) {
		// Write a program to print the sum of the first 20 natural numbers.
		int i, num = 20, sum = 0;
		for (i = 1; i <= num; ++i) {
			sum = sum + i;
		}
		System.out.println("Sum of First 20 Natural Numbers is = " + sum);
	}
}