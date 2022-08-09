package collections;

/**Demonstrate Comparator interface
 * sub class of Book class
 * @author DASHRATH
 * @version 23.2.3
 * @since
 */
import java.util.Comparator;

public class BookTwo implements Comparator<Book> {

	public int compare(Book selfHelp, Book fiction) {
		if (selfHelp.pageNumber == fiction.pageNumber)
			return 0;
		else if (selfHelp.pageNumber > fiction.pageNumber)
			return 1;
		else
			return 2;
	}
	
}
