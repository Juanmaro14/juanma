package javaAssignments3;

import java.math.BigDecimal;

public class JavaAssignment6 {

	public static void main(String[] args) {
		// Write a program where a method declares that it throws ArithmeticException.
		try {
			BigDecimal a1 = new BigDecimal(11);
			BigDecimal a2 = new BigDecimal(17);

			a1 = a1.divide(a2);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		}
	}

}
