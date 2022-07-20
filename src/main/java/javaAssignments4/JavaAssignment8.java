package javaAssignments4;

import java.util.Enumeration;
import java.util.Hashtable;

public class JavaAssignment8 {

	public static void main(String[] args) {
		// Get Set view of keys from HashTable.
		Hashtable ht = new Hashtable();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		Enumeration e = ht.keys();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
