package javaAssignments1;

public class JavaAssignment9 {
	public static void main(String[] args) {
		// Write a program to print only even numbers till 50
		int number = 50;
		System.out.print("List of even numbers from 1 to " + number + ": ");
		for (int i = 1; i <= number; i++) {
			// logic to check if the number is even or not
			// if i%2 is equal to zero, the number is even
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}