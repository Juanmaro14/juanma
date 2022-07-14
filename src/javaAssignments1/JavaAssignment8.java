package javaAssignments1;

import java.util.Scanner;

public class JavaAssignment8 {
	public static void main(String[] args) {
		// Write a program to reverse the elements of an array where the array size as
		// well as the array values are entered by the user

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number for Array: ");
			arr[i] = sc.nextInt();

		}
		System.out.println("Original array: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		// Loop through the array in reverse order
		for (int k = arr.length - 1; k >= 0; k--) {
			System.out.print(arr[k] + " ");
		}
	}
}