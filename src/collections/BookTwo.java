package collections;

import java.util.Comparator;

/**
 * Demonstrate comparator interface sub class of book class
 * 
 * @author DASHRATH
 * @version 23.2.3
 * @since
 */

public class BookTwo implements Comparator<Book> {
	public int compare(Book selfHelpBook, Book fictionBook) {
		if (selfHelpBook.pageNumber == fictionBook.pageNumber) {
			return 0;
		} else if (selfHelpBook.pageNumber > fictionBook.pageNumber) {
			return 1;
		} else {
			return 2;
		}
	}

}
