package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Set collection. We craete duplicat elemant and see this string is set allow
 * or not.
 * 
 * @author DASHRATH
 * @version 21.1
 * @since
 */

public class SetCollecation {

	public static void main(String[] args) {
		Set<String> listOfStringValues = new HashSet<String>();
		// Adding string
		listOfStringValues.add("Hello");
		listOfStringValues.add("World");
		listOfStringValues.add("$yourname");
		listOfStringValues.add("Hello"); // Adding duplicat string but in Set not allow duplicat string.
		listOfStringValues.add("myname");

		System.out.println(listOfStringValues);
	}

}