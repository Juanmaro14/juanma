package javaAssignments2;

public class JavaAssignment2 {

	public static void main(String[] args) {
		// Find all the odd numbers from 79 to 187
		int number = 187;

		System.out.print("List of odd numbers from 79 to " + number + ": ");
		for (int i = 79; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
