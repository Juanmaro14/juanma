package javaAssignments3;

public class JavaAssignment8 {

	public static void main(String[] args) {
		// Write a program to re-throw an exception.
		try {
			try {
				System.out.println("going to divide by 0");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
				throw new Exception("thrown from ArithmeticException catch to catch outer exception");
			}
		} catch (Exception e) {
			System.out.println("handled the exception (outer catch)");

		}
	}

}
