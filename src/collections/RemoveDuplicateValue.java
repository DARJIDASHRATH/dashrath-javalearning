package collections;

/**Using Arraylist and LinkedHashSet Removing 
 * Duplicate data from list
 * 
 * @author DASHRATH
 * @version 22.0
 * @since
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "A", "C", "E", "E", "E"));
		System.out.println("List of Duplicate Value:  " + list);
		// Convert ArrayList into Set
		Set<String> newList = new LinkedHashSet<String>();
		newList.addAll(list);
		// Clearing newlist
		newList.clear();
		// Add Arraylist data in Set
		newList.addAll(list);
		System.out.println("Removed Duplicate value from list: " + newList);
	}

}
