package javaAssignments4;

import java.util.HashSet;
import java.util.Set;

public class JavaAssignment5 {

	public static void main(String[] args) {
		// Copy all elements of a HashSet to an Object array
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(0);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);

		System.out.println("Elements in set = " + hs);
		System.out.println("Copying all elements...");
		Object[] obArr = hs.toArray();
		System.out.println("Elements in object array = ");
		for (Object ob : obArr)
			System.out.println(ob);
	}

}
