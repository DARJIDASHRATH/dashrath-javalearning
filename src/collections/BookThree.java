package collections;

import java.util.Comparator;

/**
 * Demonstrate comparator interface sub class of book class
 * 
 * @author DASHRATH
 * @version 23.2.4
 * @since
 */

class BookThree implements Comparator<Book> {
	public int compare(Book selfHelpBook, Book fictionBook) {
		return selfHelpBook.name.compareTo(fictionBook.name);
	}

}