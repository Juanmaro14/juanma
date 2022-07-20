package javaAssignments3;

public class JavaAssignment7 {

	public static void main(String[] args) {
		// Write a program with nested try blocks.
		try {
			try {
				System.out.println("going to divide by 0");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println("handled the exception (outer catch)");
		}
	}

}
