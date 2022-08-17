package collections;

import java.util.Comparator;

/**
 * Demonstrate Comparator interface sub class of Book
 * 
 * @author DASHRATH
 * @version 23.2.2
 * @since
 */

class BookOne implements Comparator<Book> {

	public int compare(Book selfHelpBook, Book fictionBook) {
		if (selfHelpBook.edition == fictionBook.edition) {
			return 0;
		} else if (selfHelpBook.edition > fictionBook.edition) {
			return 1;
		} else {
			return -1;
		}
	}

}