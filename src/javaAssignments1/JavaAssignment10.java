package javaAssignments1;

public class JavaAssignment10 {
	public static void main(String[] args) {
		// Write a program to print this output using a two-dimensional array.
		int rows = 10;
		System.out.println("Triangle Array");
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}