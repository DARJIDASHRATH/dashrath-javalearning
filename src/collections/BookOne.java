package collections;

/** Demonstrate Comparator interface
 * sub class of Book
 * @author DASHRATH
 * @version 23.2.2
 * @since
 */

import java.util.Comparator;

class BookOne implements Comparator<Book> {

	public int compare(Book selfHelp, Book fiction) {
		{
			if (selfHelp.edition == fiction.edition)
				return 0;
			else if (selfHelp.edition > fiction.edition)
				return 1;
			else
				return -1;

		}
	}

}