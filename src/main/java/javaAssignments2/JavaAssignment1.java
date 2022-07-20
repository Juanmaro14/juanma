package javaAssignments2;

public class JavaAssignment1 {

	public static void main(String[] args) {
		// Java Program to Calculate average of numbers using Array
		double[] arr = { 20, 14.89, 17.5, 300, 3.14 };
		double total = 0;

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		double average = total / arr.length;

		System.out.format("The average is: %.3f", average);
	}

}
