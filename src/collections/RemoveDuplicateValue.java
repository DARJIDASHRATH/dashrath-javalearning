package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Using arraylist and linkedHashSet removing duplicate data from list
 * 
 * @author DASHRATH
 * @version 22.0
 * @since
 */

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		ArrayList<String> alphabetList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "A", "C", "E", "E", "E"));
		System.out.println("List of duplicate alphabet:  " + alphabetList);
		// Convert ArrayList into Set
		Set<String> newAlphabetList = new LinkedHashSet<String>();
		newAlphabetList.addAll(alphabetList);
		// Clearing newlist
		newAlphabetList.clear();
		// Add Arraylist data in Set
		newAlphabetList.addAll(alphabetList);
		System.out.println("Removed Duplicate alphabet from alphabet list: " + newAlphabetList);
	}

}