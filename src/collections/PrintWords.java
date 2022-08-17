package collections;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Print values using an iterator
 * 
 * @author DASHRATH
 * @version 20.0
 * @since
 */

public class PrintWords {

	public static void main(String[] args) {
		ArrayList<String> listOfStringValues = new ArrayList<String>();
		listOfStringValues.add("Hello");
		listOfStringValues.add("World");
		listOfStringValues.add("$yourname");
		listOfStringValues.add("myname");

		Iterator<String> stringValuesList = listOfStringValues.iterator();
		System.out.println(stringValuesList.next());
		System.out.println(stringValuesList.next());
		System.out.println(stringValuesList.next());
		System.out.println(stringValuesList.next());
	}

}