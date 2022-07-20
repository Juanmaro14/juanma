package javaAssignments3;

public class JavaAssignment5 {

	public static void main(String[] args) {
		// Write a program to throw NumberFormatException and handle it appropriately
		// with a proper message.

		try {
			int a = Integer.parseInt("1abcd2");
			System.out.println(a);
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormat Exception: invalid input string");
		}
	}

}
