package collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrate Comparator interface TestBook class is the Runner class for Book
 * clss
 * 
 * @author DASHRATH
 * @version 23.2.5
 * @since
 */

public class TestBook {

	public static void main(String[] args) {
		ArrayList<Book> crossword = new ArrayList<Book>();
		// Adding books details (page number , name , edition number).
		crossword.add(new Book(215, "Avtar", 3));
		crossword.add(new Book(325, "Harry Porter", 12));
		crossword.add(new Book(205, "Gita", 1));

		System.out.println("Book Edition"); // Printing book edition number
		Collections.sort(crossword, new BookOne());
		for (Book selfHelpBook : crossword) {
			System.out.println(selfHelpBook.edition);
		}

		System.out.println("Book Total Number of page"); // Printing book page number
		Collections.sort(crossword, new BookTwo());
		for (Book selfHelpBook : crossword) {
			System.out.println(selfHelpBook.pageNumber);
		}

		System.out.println("Book Name"); // Printing name of the book
		Collections.sort(crossword, new BookThree());
		for (Book selfHelpBook : crossword) {
			System.out.println(selfHelpBook.name);
		}
	}

}